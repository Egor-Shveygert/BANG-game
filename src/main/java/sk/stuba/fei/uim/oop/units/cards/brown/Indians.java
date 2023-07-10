package sk.stuba.fei.uim.oop.units.cards.brown;

import sk.stuba.fei.uim.oop.units.Player;

import java.util.ArrayList;

public class Indians extends BrownCard{
    private ArrayList<Player> players;
    public Indians(String name, ArrayList<Player> players) {
        super(name);
        this.players = players;
    }

    @Override
    public void useCard(Player aimPlayer, Player currentPlayer) {
        for (var player : players) {
            var isPlayerHasBang = false;
            if(!player.equals(currentPlayer)) {
                for (var card : player.getPersonalCards()) {
                    if (card.getName().equals("Bang")){
                        player.getPersonalCards().remove(card);
                        System.out.println(player.getName() + " lose bang card");
                        isPlayerHasBang = true;
                        break;
                    }
                }
                if (!isPlayerHasBang) {
                    player.setHp(player.getHp() - 1);
                    System.out.println(player.getName() + " lose 1 hp");
                }
            }
        }
        currentPlayer.removeCardToDiscardDeck(this);
    }
}
