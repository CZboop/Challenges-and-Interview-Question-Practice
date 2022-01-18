package ObjectOrientedDesign.Jukebox;

import java.util.ArrayList;
import java.util.HashMap;

public class JukeboxService {
    private Jukebox jukebox;

    public JukeboxService(Jukebox jukebox) {
        this.jukebox = jukebox;
    }

    public Jukebox getJukebox() {
        return jukebox;
    }

    public void setJukebox(Jukebox jukebox) {
        this.jukebox = jukebox;
    }

    public void addSong(Song song){
        if (jukebox.getRecords().size() < jukebox.getMaxRecords()){
            ArrayList<Song> recordList = jukebox.getRecords();
            recordList.add(song);
            jukebox.setRecords(recordList);
        } else {
            throw new IllegalStateException("Jukebox can't hold any more songs!");
        }
    }

    public void removeSong(Song song){
        if (jukebox.getRecords().contains(song)){
            ArrayList<Song> recordList = jukebox.getRecords();
            recordList.remove(song);
            jukebox.setRecords(recordList);
        } else {
            throw new IllegalStateException("Song not found");
        }
    }

    public boolean isValidCoins(ArrayList<Coin> coins){
        int totalValue = 0;
        for (Coin coin : coins){
            if (coin.getWeight() == coin.getExpectedWeight()){
                totalValue += coin.getValue();
            }
        }
        if (totalValue < jukebox.getSongPrice()){
            return false;
        }
        return true;
    }

    public String playSong(ArrayList<Coin> coins){
        if (isValidCoins(coins)){
            return "Song is playing...";
        } else {
            throw new IllegalStateException("You did not provide enough money, this may be because some coins were not accepted");
        }
    }

}
