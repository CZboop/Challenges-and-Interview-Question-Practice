package ObjectOrientedDesign.DeckOfCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Deck {
    ArrayList<Card> cards;

    public Deck() {
        ArrayList<Card> cards = new ArrayList<>();
        Suit[] suits = {Suit.HEARTS, Suit.SPADES,Suit.DIAMONDS,Suit.CLUBS};
        String[] highCards = {"Jack", "Queen", "King"};
        for (int i=2; i<11; i++){
            for (int j=0; j<4; j++){
                Card card = new Card(new int[]{i},suits[j],
                        String.valueOf(i) + " of " + suits[j].name().substring(0,1) + suits[j].name().substring(1).toLowerCase());
                cards.add(card);
            }
        }
        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                Card card = new Card(new int[]{10},suits[j],
                        highCards[i] + " of " + suits[j].name().substring(0,1) + suits[j].name().substring(1).toLowerCase());
                cards.add(card);
            }
        }
        for (int j=0; j<4; j++){
            Card card = new Card(new int[]{11, 1},suits[j],
                    "Ace of " + suits[j].name().substring(0,1) + suits[j].name().substring(1).toLowerCase());
            cards.add(card);
        }
        Collections.shuffle(cards);
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck = (Deck) o;
        return Objects.equals(cards, deck.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cards);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}
