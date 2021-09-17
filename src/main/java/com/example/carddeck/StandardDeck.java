package com.example.carddeck;

import java.util.List;

public class StandardDeck extends AbstractDeck{

    private List<Card> ArrayList;

    public StandardDeck() {

        this.cards = newDeck();
    }

    private List<Card> newDeck() {

        List<Card> newDeck = ArrayList<>;

        for(Suit suit : Suit.values()){
            for (FaceValue faceValue : StandardFaceValue.values()){
                newDeck.add(new Card(suit, faceValue));
            }
        }

        return newDeck;

    }

    @Override
    public void cut(int index) {

    }

    @Override
    public Card deal() {
        return null;
    }

    @Override
    public void newOrder(Deck deck) {

    }

    @Override
    public int search(Card card) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Card turnOver() {
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StandardDeck{");
        sb.append("cards=").append(cards);
        sb.append('}');
        return sb.toString();
    }
}
