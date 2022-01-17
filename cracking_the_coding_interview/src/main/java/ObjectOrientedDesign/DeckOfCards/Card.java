package ObjectOrientedDesign.DeckOfCards;

import java.util.Arrays;
import java.util.Objects;

public class Card {
    int[] values;
    Suit suit;
    String name;

    public Card(int[] values, Suit suit, String name) {
        this.values = values;
        this.suit = suit;
        this.name = name;
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Arrays.equals(values, card.values) && suit == card.suit && Objects.equals(name, card.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(suit, name);
        result = 31 * result + Arrays.hashCode(values);
        return result;
    }

    @Override
    public String toString() {
        return "Card{" +
                "values=" + Arrays.toString(values) +
                ", suit=" + suit +
                ", name='" + name + '\'' +
                '}';
    }
}
