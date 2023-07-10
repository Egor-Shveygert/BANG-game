package sk.stuba.fei.uim.oop.units.cards.brown;

import sk.stuba.fei.uim.oop.units.Player;

public class Miss extends BrownCard{
    public Miss(String name) {
        super(name);
    }

    @Override
    public void useCard(Player aimPlayer, Player currentPlayer) {
        System.out.println("Aimed player used miss card and avoided bang");
        aimPlayer.removeCardToDiscardDeck(this);
    }
}
