package sk.stuba.fei.uim.oop.units.cards.brown;

import sk.stuba.fei.uim.oop.console.Console;
import sk.stuba.fei.uim.oop.units.Player;

import java.util.Random;

public class CatBaluo extends BrownCard{
    private Console console;
    private Random random;

    public CatBaluo(String name, Console console, Random random) {
        super(name);
        this.console = console;
        this.random = random;
    }

    @Override
    public void useCard(Player aimPlayer, Player currentPlayer) {
        var selectAimDeck = console.verifyNumber(1,2, "1.Effect cards\n2.Personal cards");
        if(selectAimDeck == 1 && aimPlayer.getEffectCards().size() > 0) {
            var randomCard = random.nextInt(aimPlayer.getEffectCards().size());
            System.out.println(currentPlayer.getName() + " removed " + aimPlayer.getEffectCards().get(randomCard).getName() + " from " + aimPlayer.getName());
            aimPlayer.removeCardToDiscardDeck(aimPlayer.getEffectCards().get(randomCard));
            currentPlayer.removeCardToDiscardDeck(this);
        }
        else if (selectAimDeck == 2 && aimPlayer.getPersonalCards().size() > 0) {
            var randomCard = random.nextInt(aimPlayer.getPersonalCards().size());
            System.out.println(currentPlayer.getName() + " removed " + aimPlayer.getPersonalCards().get(randomCard).getName() + " from " + aimPlayer.getName());
            aimPlayer.removeCardToDiscardDeck(aimPlayer.getPersonalCards().get(randomCard));
            currentPlayer.removeCardToDiscardDeck(this);
        }
        else {
            System.out.println("You can not play this card, please next time select card more careful");
        }
    }
}
