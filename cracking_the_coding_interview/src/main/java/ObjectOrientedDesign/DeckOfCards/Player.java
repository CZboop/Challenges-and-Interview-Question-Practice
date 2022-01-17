package ObjectOrientedDesign.DeckOfCards;

import java.util.ArrayList;
import java.util.Objects;

public class Player {
    int playerId;
    ArrayList<Card> cards;
    int money;
    int score;
    int currentBet;

    public Player(int playerId, ArrayList<Card> cards, int money, int score, int currentBet) {
        this.playerId = playerId;
        this.cards = cards;
        this.money = money;
        this.score = score;
        this.currentBet = currentBet;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCurrentBet() {
        return currentBet;
    }

    public void setCurrentBet(int currentBet) {
        this.currentBet = currentBet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return playerId == player.playerId && money == player.money && score == player.score && currentBet == player.currentBet && Objects.equals(cards, player.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, cards, money, score, currentBet);
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", cards=" + cards +
                ", money=" + money +
                ", score=" + score +
                ", currentBet=" + currentBet +
                '}';
    }
}
