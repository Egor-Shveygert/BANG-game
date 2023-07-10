package sk.stuba.fei.uim.oop.units;

import sk.stuba.fei.uim.oop.units.cards.Card;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> personalCards;
    private ArrayList<Card> effectCards;
    private ArrayList<Card> discardDeck;
    private int hp;

    public Player(String name, ArrayList<Card> personalCards, int hp, ArrayList<Card> discardDeck) {
        this.name = name;
        this.personalCards = personalCards;
        this.hp = hp;
        this.discardDeck = discardDeck;
        this.effectCards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public ArrayList<Card> getPersonalCards() {
        return personalCards;
    }

    @Override
    public String toString() {
        return  name + " HP:" + hp + " \nEffect cards: " + (effectCards.size() == 0 ? "none" : effectCards) + "\nPlayer Cards:" + personalCards;
    }

    public String showOpponent() {
        return  name + " HP:" + hp + " \nEffect cards: " + (effectCards.size() == 0 ? "none" : effectCards);
    }
    public void removeCardToDiscardDeck(Card card) {
        discardDeck.add(card);
        getPersonalCards().remove(card);
        getEffectCards().remove(card);
    }

    public ArrayList<String> getPersonalCardsNames(){
        var cardsName = new ArrayList<String>();
        for (var element : personalCards) {
            cardsName.add(element.getName());
        }
        return cardsName;
    }

    public ArrayList<String> getEffectCardsNames(){
        var cardsName = new ArrayList<String>();
        for (var element : effectCards) {
            cardsName.add(element.getName());
        }
        return cardsName;
    }

    public Card findCardInEffectCards(String cardName) {
        for (Card card : effectCards) {
            if (card.getName().equals(cardName)) {
                return card;
            }
        }
        return null;
    }

    public ArrayList<Card> getEffectCards() {
        return effectCards;
    }
}
