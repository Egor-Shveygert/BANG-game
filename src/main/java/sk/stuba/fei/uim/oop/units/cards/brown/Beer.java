package sk.stuba.fei.uim.oop.units.cards.brown;

import sk.stuba.fei.uim.oop.units.Player;
public class Beer extends BrownCard {
    public Beer(String name) {
        super(name);
    }

    public void useCard(Player aimPlayer, Player currentPlayer) {
        currentPlayer.setHp(currentPlayer.getHp() + 1);
        System.out.println("You added 1 hp to yourself");
        currentPlayer.removeCardToDiscardDeck(this);
    }
}
