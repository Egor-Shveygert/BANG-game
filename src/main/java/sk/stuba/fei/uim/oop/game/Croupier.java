package sk.stuba.fei.uim.oop.game;

import sk.stuba.fei.uim.oop.units.cards.Card;

import java.util.ArrayList;

public class Croupier {
    public Croupier() {
    }

    public ArrayList<Card> dealCards(int dealNum, ArrayList<Card> deck) {
        if (deck.size() == 1) {
            dealNum = 1;
        }
        var cards = new ArrayList<Card>();
        for (int i = 0; i < dealNum; i++) {
            cards.add(deck.get(0));
            deck.remove(0);
        }
        return cards;
    }

}
