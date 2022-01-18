package ObjectOrientedDesignTest;

import ObjectOrientedDesign.DeckOfCards.Card;
import ObjectOrientedDesign.DeckOfCards.Deck;
import ObjectOrientedDesign.Jukebox.Coin;
import ObjectOrientedDesign.Jukebox.Jukebox;
import ObjectOrientedDesign.Jukebox.JukeboxService;
import ObjectOrientedDesign.Jukebox.Song;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class JukeboxTest {
    private JukeboxService underTest;

    @BeforeEach
    void setUp(){
        underTest = new JukeboxService(new Jukebox(new ArrayList<Song>(), 50, 10));
    }

    @Test
    void canAddSongWhenThereIsSpace() {
        // Given
        int startLen = underTest.getJukebox().getRecords().size();
        Song songToAdd = new Song(1L, "Song", "Artist", 200);

        // When
        underTest.addSong(songToAdd);
        boolean actual = underTest.getJukebox().getRecords().contains(songToAdd);
        int endLen = underTest.getJukebox().getRecords().size();

        // Then
        assertThat(actual).isTrue();
        assertThat(startLen).isEqualTo(endLen - 1);
    }

    @Test
    void doesNotAddSongWhenThereIsNoSpace() {
        // Given
        int startLen = underTest.getJukebox().getRecords().size();
        Song songToAdd1 = new Song(1L, "Song", "Artist", 200);
        Song songToAdd2 = new Song(2L, "Song", "Artist", 200);
        Song songToAdd3 = new Song(3L, "Song", "Artist", 200);
        Song songToAdd4 = new Song(4L, "Song", "Artist", 200);
        Song songToAdd5 = new Song(5L, "Song", "Artist", 200);
        Song songToAdd6 = new Song(6L, "Song", "Artist", 200);
        Song songToAdd7 = new Song(7L, "Song", "Artist", 200);
        Song songToAdd8 = new Song(8L, "Song", "Artist", 200);
        Song songToAdd9 = new Song(9L, "Song", "Artist", 200);
        Song songToAdd10 = new Song(10L, "Song", "Artist", 200);
        Song songToAdd11 = new Song(11L, "Song", "Artist", 200);

        // When
        underTest.addSong(songToAdd1);
        underTest.addSong(songToAdd2);
        underTest.addSong(songToAdd3);
        underTest.addSong(songToAdd4);
        underTest.addSong(songToAdd5);
        underTest.addSong(songToAdd6);
        underTest.addSong(songToAdd7);
        underTest.addSong(songToAdd8);
        underTest.addSong(songToAdd9);
        underTest.addSong(songToAdd10);

        // Then
        assertThatThrownBy(() -> {underTest.addSong(songToAdd11);}).hasMessageContaining("Jukebox can't hold any more songs!");
    }

    @Test
    void canRemoveSongWhenInJukebox() {
        // Given
        Song song = new Song(1L, "Song", "Artist", 200);
        underTest.addSong(song);
        int startLen = underTest.getJukebox().getRecords().size();

        // When
        underTest.removeSong(song);
        boolean actual = !underTest.getJukebox().getRecords().contains(song);
        int endLen = underTest.getJukebox().getRecords().size();

        // Then
        assertThat(actual).isTrue();
        assertThat(startLen).isEqualTo(endLen + 1);
    }

    @Test
    void throwsExceptionWhenRemoveSongNotInJukebox() {
        // Given
        Song song = new Song(1L, "Song", "Artist", 200);
        underTest.addSong(song);

        // When
        Song song2 = new Song(2L, "Another Song", "Another Artist", 300);
        boolean actual = !underTest.getJukebox().getRecords().contains(song);

        // Then
        assertThatThrownBy(() -> {underTest.removeSong(song2);}).hasMessageContaining("Song not found");
    }

    @Test
    void returnsTrueForFullyValidCoinsExactCost() {
        // Given
        ArrayList<Coin> coins = new ArrayList<>(List.of(
                new Coin(10, 12, 12),
                new Coin(20, 25, 25),
                new Coin(20, 25, 25)
        ));

        // When
        boolean actual = underTest.isValidCoins(coins);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void returnsTrueForFullyValidCoinsAboveCost() {
        // Given
        ArrayList<Coin> coins = new ArrayList<>(List.of(
                new Coin(10, 12, 12),
                new Coin(50, 35, 35),
                new Coin(20, 25, 25)
        ));

        // When
        boolean actual = underTest.isValidCoins(coins);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void returnsFalseForValidCoinsNotEnoughForSong() {
        // Given
        ArrayList<Coin> coins = new ArrayList<>(List.of(
                new Coin(10, 12, 12),
                new Coin(5, 10, 10),
                new Coin(20, 25, 25)
        ));

        // When
        boolean actual = underTest.isValidCoins(coins);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void returnsFalseForCoinsEnoughForSongButWeightDiscrepancy() {
        // Given
        ArrayList<Coin> coins = new ArrayList<>(List.of(
                new Coin(10, 12, 12),
                new Coin(50, 10, 30),
                new Coin(20, 25, 25)
        ));

        // When
        boolean actual = underTest.isValidCoins(coins);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void returnsFalseForCoinsNotEnoughForSongAndWeightDiscrepancy() {
        // Given
        ArrayList<Coin> coins = new ArrayList<>(List.of(
                new Coin(10, 12, 12),
                new Coin(5, 2, 30),
                new Coin(5, 10, 10)
        ));

        // When
        boolean actual = underTest.isValidCoins(coins);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void playSongThrowsExceptionIfCoinsInvalid() {
        // Given
        ArrayList<Coin> coins = new ArrayList<>(List.of(
                new Coin(10, 12, 12),
                new Coin(5, 2, 30),
                new Coin(5, 10, 10)
        ));

        // When

        // Then
        assertThatThrownBy(() -> {underTest.playSong(coins);}).hasMessageContaining(
                "You did not provide enough money, this may be because some coins were not accepted"
        );
    }

    @Test
    void playSongReturnsSongPlayingMessageIfCoinsValid() {
        // Given
        ArrayList<Coin> coins = new ArrayList<>(List.of(
                new Coin(10, 12, 12),
                new Coin(20, 15, 15),
                new Coin(20, 15, 15)
        ));

        // When
        String actual = underTest.playSong(coins);
        String expected = "Song is playing...";

        // Then
        assertThat(actual).isEqualTo(expected);
    }

}
