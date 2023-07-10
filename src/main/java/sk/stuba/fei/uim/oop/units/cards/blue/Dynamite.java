package sk.stuba.fei.uim.oop.units.cards.blue;

import sk.stuba.fei.uim.oop.units.Player;

import java.util.Random;

public class Dynamite extends BlueCard{
    private Random random;

    public Dynamite(String name, Random random) {
        super(name);
        this.random = random;
    }

    @Override
    public void useCard(Player aimPlayer, Player currentPlayer) {
        if(super.isEffectCardPlayable(currentPlayer)) {
            currentPlayer.getEffectCards().add(this);
            currentPlayer.getPersonalCards().remove(this);
        }
    }

    @Override
    public boolean useEffectCard(Player currentPlayer) {
        int ranNum = random.nextInt(8) + 1;
        if(ranNum == 8) {
            currentPlayer.setHp(currentPlayer.getHp() - 3);
            currentPlayer.removeCardToDiscardDeck(this);
            System.out.println("BOOOOM, you lose 3 hp");
            return true;
        }
        System.out.println("Dynamite didn't blow up");
        return false;
    }
}
