package sk.stuba.fei.uim.oop.game;

import sk.stuba.fei.uim.oop.console.Console;
import sk.stuba.fei.uim.oop.console.ZKlavesnice;
import sk.stuba.fei.uim.oop.units.Player;
import sk.stuba.fei.uim.oop.units.cards.Card;
import sk.stuba.fei.uim.oop.units.cards.blue.Barrel;
import sk.stuba.fei.uim.oop.units.cards.blue.Dynamite;
import sk.stuba.fei.uim.oop.units.cards.blue.Prison;
import sk.stuba.fei.uim.oop.units.cards.brown.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Game {
    private ArrayList<Player> players;
    private ArrayList<Card> deck;
    private ArrayList<Card> discardDeck;
    private Console console;
    private Croupier croupier;
    private Random random;
    public Game() {
        players = new ArrayList<>();
        deck = new ArrayList<>();
        console = new Console();
        discardDeck = new ArrayList<>();
        croupier = new Croupier();
        random = new Random();
        createDeck();
        Collections.shuffle(deck);
        createPlayers();

        startGame();


    }

    public void startGame(){
        System.out.println("Welcome to the Bang\n");

        var currentPlayerIndex = 0;
        while (players.size() > 1) {
            checkDeck();
            var currentPlayer = players.get(currentPlayerIndex);
            if (currentPlayer.getEffectCards().contains(currentPlayer.findCardInEffectCards("Dynamite"))) {
                if(!currentPlayer.findCardInEffectCards("Dynamite").useEffectCard(currentPlayer)) {
                    moveDynamite(currentPlayer);
                }
                else if(currentPlayer.getHp() <= 0) {
                    currentPlayerIndex =(currentPlayerIndex + 1) % players.size();
                    checkAllPlayersHP();
                    continue;
                }
            }
            if(currentPlayer.getEffectCards().contains(currentPlayer.findCardInEffectCards("Prison"))){
                if (currentPlayer.findCardInEffectCards("Prison").useEffectCard(currentPlayer)) {
                    currentPlayerIndex =(currentPlayerIndex + 1) % players.size();
                    continue;
                }
            }
            currentPlayer.getPersonalCards().addAll(croupier.dealCards(2, deck));

            var move = 0;
            while (move != 3 || currentPlayer.getPersonalCards().size() > currentPlayer.getHp()) {
                checkDeck();
                console.showDisplay(currentPlayer);
                move = console.verifyNumber(1, 3, "\nSelect your move: ");

                if (move == 1 && currentPlayer.getPersonalCards().size() > 0) {
                    var selectedCard = selectCard(currentPlayer);
                    Player aimPlayer = new Player("Aim",  new ArrayList<>(), 4, deck);
                    selectedCard = checkMissCard(selectedCard, currentPlayer);
                    if (!selectedCard.getName().equals("Beer") && !selectedCard.getName().equals("Stagecoach") && !selectedCard.getName().equals("Indians")
                            && !selectedCard.getName().equals("Barrel") && !selectedCard.getName().equals("Dynamite")) {

                        console.displayPlayers(players, currentPlayer);
                        var aimIndexPlayer = console.verifyNumber(1, players.size() - 1, "Select aim player: ") - 1;
                        aimPlayer = console.selectPlayer(players, currentPlayer, aimIndexPlayer);
                    }
                    selectedCard.useCard(aimPlayer, currentPlayer);
                    checkAllPlayersHP();
                    checkDeck();
                    if (checkWinner()) {
                        break;
                    }
                }
                else if (move == 2 && currentPlayer.getPersonalCards().size() > 0) {
                    var selectedCard = selectCard(currentPlayer);
                    currentPlayer.removeCardToDiscardDeck(selectedCard);
                    System.out.println("You discarded " + selectedCard.getName());
                }
                else if (move == 3 && currentPlayer.getPersonalCards().size() > currentPlayer.getHp()){
                    System.out.println("you must have less or same amount of cards as your HP");
                }
            }
            System.out.println("You finished your turn");

            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        }
        System.out.println("Congratulations to " + players.get(0).getName());
    }

    public void moveDynamite(Player currenPlayer) {
        var playerIndex = players.indexOf(currenPlayer);
        if(playerIndex == 0) {
            playerIndex = players.size();
        }
        var previousPlayer = players.get(playerIndex - 1);
        var dynamiteCurd = currenPlayer.findCardInEffectCards("Dynamite");
        previousPlayer.getEffectCards().add(dynamiteCurd);
        currenPlayer.getEffectCards().remove(dynamiteCurd);
        System.out.println(currenPlayer.getName() + " send dynamite to " + previousPlayer.getName());

    }
    public Card checkMissCard(Card selectedCard, Player currentPlayer) {
        if (selectedCard.getName().equals("Miss")) {
            System.out.println("You can not select Miss, please select another card");
            var newSelectedCard = selectCard(currentPlayer);
            return checkMissCard(newSelectedCard, currentPlayer);
        }
        return selectedCard;
    }

    public void checkDeck() {
        if(deck.size() == 0) {
            deck.addAll(discardDeck);
            discardDeck.removeAll(deck);
            Collections.shuffle(deck);
        }
    }

    public Card selectCard(Player currentPlayer) {
        console.showCards(currentPlayer.getPersonalCards());
        var useCardIndex = console.verifyNumber(1, currentPlayer.getPersonalCards().size(), "Select your card:") - 1;
        return currentPlayer.getPersonalCards().get(useCardIndex);
    }

    public boolean checkWinner() {
        return players.size() == 1;
    }

    public void checkAllPlayersHP() {
        for (int i = 0; i < players.size(); i ++) {
            if (players.get(i).getHp() <= 0) {
                discardDeck.addAll(players.get(i).getPersonalCards());
                players.get(i).getPersonalCards().removeAll(players.get(i).getPersonalCards());
                discardDeck.addAll(players.get(i).getEffectCards());
                players.get(i).getEffectCards().removeAll(players.get(i).getEffectCards());
                players.remove(players.get(i));
            }
        }
    }

    public void createPlayers() {
        System.out.println("-------------Welcome to the BANG!!!--------------");
        var numberOfPlayers = console.verifyNumber(2, 4, "How many players are going to attempt the game (2-4): ");
        System.out.println(numberOfPlayers);
        for (int i = 0; i < numberOfPlayers; i++) {
            var playerName = ZKlavesnice.readString("Write down please name: ");
            var player = new Player(playerName, croupier.dealCards(4, deck), 4, discardDeck);
            players.add(player);
        }
    }

    public void createDeck() {

        deck.add(new Barrel("Barrel", random));
        deck.add(new Barrel("Barrel", random));
        deck.add(new Dynamite("Dynamite", random));
        deck.add(new Prison("Prison", random));
        deck.add(new Prison("Prison", random));
        deck.add(new Prison("Prison", random));

        for(int i = 0; i < 30; i++) {
            deck.add(new Bang("Bang", random));
        }
        for(int i = 0; i < 15; i++) {
            deck.add(new Miss("Miss"));
        }
        for(int i = 0; i < 8; i++) {
            deck.add(new Beer("Beer"));
        }
        for(int i = 0; i < 6; i++) {
            deck.add(new CatBaluo("CatBaluo", console, random));
        }
        for(int i = 0; i < 4; i++) {
            deck.add(new Stagecoach("Stagecoach", deck, croupier));
        }
        for(int i = 0; i < 2; i++) {
            deck.add(new Indians("Indians", players));
        }
    }
}
