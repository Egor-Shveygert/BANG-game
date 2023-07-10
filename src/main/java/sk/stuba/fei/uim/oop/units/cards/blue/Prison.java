package sk.stuba.fei.uim.oop.units.cards.blue;

import sk.stuba.fei.uim.oop.units.Player;

import java.util.Random;

public class Prison extends BlueCard{
    private Random random;

    public Prison(String name, Random random) {
        super(name);
        this.random = random;
    }

    @Override
    public void useCard(Player aimPlayer, Player currentPlayer) {
        if(super.isEffectCardPlayable(aimPlayer)) {
            aimPlayer.getEffectCards().add(this);
            currentPlayer.getPersonalCards().remove(this);
        }
    }

    @Override
    public boolean useEffectCard(Player currentPlayer) {
        int ranNum = random.nextInt(4) + 1;
        currentPlayer.removeCardToDiscardDeck(this);
        if(ranNum == 4) {
            System.out.println(currentPlayer.getName() + " escaped prison");
            return false;
        }
        System.out.println(currentPlayer.getName() + " didn't escape prison");
        return true;
    }
}
