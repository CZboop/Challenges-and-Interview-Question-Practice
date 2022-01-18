package ObjectOrientedDesign.Jukebox;

import java.util.ArrayList;
import java.util.Objects;

public class Jukebox {
    private ArrayList<Song> records;
    private int songPrice;
    private int maxRecords;

    public Jukebox(ArrayList<Song> records, int songPrice, int maxRecords) {
        this.records = records;
        this.songPrice = songPrice;
        this.maxRecords = maxRecords;
    }

    public ArrayList<Song> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Song> records) {
        this.records = records;
    }

    public int getSongPrice() {
        return songPrice;
    }

    public void setSongPrice(int songPrice) {
        this.songPrice = songPrice;
    }

    public int getMaxRecords() {
        return maxRecords;
    }

    public void setMaxRecords(int maxRecords) {
        this.maxRecords = maxRecords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jukebox jukebox = (Jukebox) o;
        return songPrice == jukebox.songPrice && maxRecords == jukebox.maxRecords && Objects.equals(records, jukebox.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(records, songPrice, maxRecords);
    }

    @Override
    public String toString() {
        return "Jukebox{" +
                "records=" + records +
                ", songPrice=" + songPrice +
                ", maxRecords=" + maxRecords +
                '}';
    }
}
