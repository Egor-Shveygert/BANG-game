package sk.stuba.fei.uim.oop.units.cards.brown;

import sk.stuba.fei.uim.oop.game.Croupier;
import sk.stuba.fei.uim.oop.units.Player;
import sk.stuba.fei.uim.oop.units.cards.Card;

import java.util.ArrayList;

public class Stagecoach extends BrownCard{
    private ArrayList<Card> deck;
    private Croupier croupier;
    public Stagecoach(String name, ArrayList<Card> deck, Croupier croupier) {
        super(name);
        this.deck = deck;
        this.croupier = croupier;
    }

    public void useCard(Player aimPlayer, Player currentPlayer) {
        currentPlayer.getPersonalCards().addAll(croupier.dealCards(2, deck));
        currentPlayer.removeCardToDiscardDeck(this);
    }
}
