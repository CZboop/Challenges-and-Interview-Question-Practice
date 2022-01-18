package ObjectOrientedDesign.Jukebox;

import java.util.Objects;

public class Coin {
    private int value;
    private int weight;
    private int expectedWeight;

    public Coin(int value, int weight, int expectedWeight) {
        this.value = value;
        this.weight = weight;
        this.expectedWeight = expectedWeight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getExpectedWeight() {
        return expectedWeight;
    }

    public void setExpectedWeight(int expectedWeight) {
        this.expectedWeight = expectedWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return value == coin.value && weight == coin.weight && expectedWeight == coin.expectedWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, weight, expectedWeight);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "value=" + value +
                ", weight=" + weight +
                ", expectedWeight=" + expectedWeight +
                '}';
    }
}
