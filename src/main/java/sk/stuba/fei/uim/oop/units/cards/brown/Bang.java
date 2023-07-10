package sk.stuba.fei.uim.oop.units.cards.brown;

import sk.stuba.fei.uim.oop.units.Player;
import sk.stuba.fei.uim.oop.units.cards.Card;

import java.util.Random;

public class Bang extends BrownCard{
    private Random random;

    public Bang(String name, Random random) {
        super(name);
        this.random = random;
    }

    @Override
    public void useCard(Player aimPlayer, Player currentPlayer) {
        currentPlayer.removeCardToDiscardDeck(this);
        if(aimPlayer.getEffectCardsNames().contains("Barrel")) {
            if (aimPlayer.findCardInEffectCards("Barrel").useEffectCard(aimPlayer)) {
                return;
            }
        }

        if (!aimPlayer.getPersonalCardsNames().contains("Miss")) {
            aimPlayer.setHp(aimPlayer.getHp() - 1);
        }
        else {
            for (Card card : aimPlayer.getPersonalCards()) {
                if (card.getName().equals("Miss")) {
                    card.useCard(aimPlayer, currentPlayer);

                    break;
                }
            }
        }
    }
}
