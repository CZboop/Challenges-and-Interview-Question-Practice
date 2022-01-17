package ObjectOrientedDesignTest;

import ObjectOrientedDesign.DeckOfCards.Card;
import ObjectOrientedDesign.DeckOfCards.Deck;
import ObjectOrientedDesign.DeckOfCards.Suit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

//testing the deck contains everything expected

public class DeckOfCardsTest {
    private Deck underTest;

    @BeforeEach
    void setUp(){
        underTest = new Deck();
    }

    @Test
    void deckIsRightLength() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        int actual = cards.size();
        int expected = 52;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void deckContainsFourAces() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        List<Card> aces = cards.stream().filter(x -> x.getValues()[0]==11).collect(Collectors.toList());
        int actual = aces.size();
        int expected = 4;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void deckContainsFourKings() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        List<Card> kings = cards.stream().filter(x -> x.getName().split(" ")[0].equals("King")).collect(Collectors.toList());
        int actual = kings.size();
        int expected = 4;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void deckContainsFourQueens() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        List<Card> queens = cards.stream().filter(x -> x.getName().split(" ")[0].equals("Queen")).collect(Collectors.toList());
        int actual = queens.size();
        int expected = 4;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void deckContainsFourJacks() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        List<Card> jacks = cards.stream().filter(x -> x.getName().split(" ")[0].equals("Jack")).collect(Collectors.toList());
        int actual = jacks.size();
        int expected = 4;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void deckContainsFour10s() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        List<Card> tens = cards.stream().filter(x -> x.getName().split(" ")[0].equals("10")).collect(Collectors.toList());
        int actual = tens.size();
        int expected = 4;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void deckContainsFour9s() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        List<Card> nines = cards.stream().filter(x -> x.getValues()[0]==9).collect(Collectors.toList());
        int actual = nines.size();
        int expected = 4;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void deckContainsFour8s() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        List<Card> eights = cards.stream().filter(x -> x.getValues()[0]==8).collect(Collectors.toList());
        int actual = eights.size();
        int expected = 4;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void deckContainsFour7s() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        List<Card> sevens = cards.stream().filter(x -> x.getValues()[0]==7).collect(Collectors.toList());
        int actual = sevens.size();
        int expected = 4;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void deckContainsFour6s() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        List<Card> sixes = cards.stream().filter(x -> x.getValues()[0]==6).collect(Collectors.toList());
        int actual = sixes.size();
        int expected = 4;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void deckContainsFour5s() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        List<Card> fives = cards.stream().filter(x -> x.getValues()[0]==5).collect(Collectors.toList());
        int actual = fives.size();
        int expected = 4;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void deckContainsFour4s() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        List<Card> fours = cards.stream().filter(x -> x.getValues()[0]==4).collect(Collectors.toList());
        int actual = fours.size();
        int expected = 4;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void deckContainsFour3s() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        List<Card> threes = cards.stream().filter(x -> x.getValues()[0]==3).collect(Collectors.toList());
        int actual = threes.size();
        int expected = 4;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void deckContainsFour2s() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        List<Card> twos = cards.stream().filter(x -> x.getValues()[0]==2).collect(Collectors.toList());
        int actual = twos.size();
        int expected = 4;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void deckContains13Hearts() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        List<Card> hearts = cards.stream().filter(x -> x.getSuit().equals(Suit.HEARTS)).collect(Collectors.toList());
        int actual = hearts.size();
        int expected = 13;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void deckContains13Spades() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        List<Card> hearts = cards.stream().filter(x -> x.getSuit().equals(Suit.SPADES)).collect(Collectors.toList());
        int actual = hearts.size();
        int expected = 13;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void deckContains13Diamonds() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        List<Card> hearts = cards.stream().filter(x -> x.getSuit().equals(Suit.DIAMONDS)).collect(Collectors.toList());
        int actual = hearts.size();
        int expected = 13;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void deckContains13Clubs() {
        // Given
        ArrayList<Card>  cards = underTest.getCards();

        // When
        List<Card> hearts = cards.stream().filter(x -> x.getSuit().equals(Suit.CLUBS)).collect(Collectors.toList());
        int actual = hearts.size();
        int expected = 13;

        // Then
        assertThat(actual).isEqualTo(expected);
    }
}
