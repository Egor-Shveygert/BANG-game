package sk.stuba.fei.uim.oop.units.cards.blue;

import sk.stuba.fei.uim.oop.units.Player;
import sk.stuba.fei.uim.oop.units.cards.Card;

public class BlueCard extends Card {


    public BlueCard(String name) {
        super(name);
    }

    public boolean isEffectCardPlayable(Player aimPlayer) {
        for (var effectCardName : aimPlayer.getEffectCardsNames()) {
            if(effectCardName.equals(getName())) {
                System.out.println("Player can not have two same effect cards");
                return false;
            }
        }
        return true;
    }
}
