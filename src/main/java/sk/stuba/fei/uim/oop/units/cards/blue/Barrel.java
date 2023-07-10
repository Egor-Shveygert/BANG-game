package sk.stuba.fei.uim.oop.units.cards.blue;

import sk.stuba.fei.uim.oop.units.Player;

import java.util.Random;

public class Barrel extends BlueCard{
    private Random random;

    public Barrel(String name, Random random) {
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
    public boolean useEffectCard(Player player) {
            int randomInt = random.nextInt(4) + 1;
            if(randomInt == 1) {
                System.out.println(player.getName() + " hided behind Barrel");
                return true;
            }
            System.out.println(player.getName() + " failed to hide behind Barrel");
            return false;
        }
}
