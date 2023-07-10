package sk.stuba.fei.uim.oop.units.cards;

import sk.stuba.fei.uim.oop.units.Player;

public class Card {
    private String name;

    public Card(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void useCard(Player aimPlayer, Player currentPlayer) {

    }

    @Override
    public String toString() {
        return  name;
    }

    public boolean useEffectCard(Player currentPlayer) {
        return true;
    }
}
