package sk.stuba.fei.uim.oop.console;

import sk.stuba.fei.uim.oop.units.Player;
import sk.stuba.fei.uim.oop.units.cards.Card;

import java.util.ArrayList;

public class Console {
    public Console() {
    }

    public int verifyNumber(int min, int max, String displayedText) {
        var num = ZKlavesnice.readInt(displayedText);
        if (num < min || num > max) {
            return verifyNumber(min, max, displayedText);
        }
        return num;
    }

    public void showDisplay(Player player) {
        System.out.println(player.toString());
        System.out.println("1.Use card\n2.Discard card\n3.Finish turn");
    }

    public void showCards(ArrayList<Card> personCards) {
        for (int i = 0; i < personCards.size(); i++) {
            System.out.println(i + 1 + "." + personCards.get(i));
        }
    }

    public void displayPlayers (ArrayList<Player> players, Player currentPlayer){
        int playerIndex = 0;
        for(int i = 0; i<players.size(); i++){
            if (!players.get(i).equals(currentPlayer)){
                System.out.println(playerIndex+ 1 + "." + players.get(i).showOpponent());
            }
            else {
              playerIndex --;
            }
            playerIndex ++;
        }
    }

    public Player selectPlayer(ArrayList<Player> players, Player currentPlayer, int aimPlayer){
        int playerIndex = 0;
        for(int i = 0; i<players.size(); i++){
            if (players.get(i).equals(currentPlayer)){
                playerIndex --;
            }
            else if(aimPlayer == playerIndex) {
                return players.get(i);
            }
            playerIndex ++;
        }
        return players.get(0);
    }

}
