package ObjectOrientedDesign.Jukebox;

import java.util.Objects;

public class Song {
    private Long id;
    private String songName;
    private String artistName;
    private int runtimeSecs;

    public Song(Long id, String songName, String artistName, int runtimeSecs) {
        this.id = id;
        this.songName = songName;
        this.artistName = artistName;
        this.runtimeSecs = runtimeSecs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getRuntimeSecs() {
        return runtimeSecs;
    }

    public void setRuntimeSecs(int runtimeSecs) {
        this.runtimeSecs = runtimeSecs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return runtimeSecs == song.runtimeSecs && Objects.equals(id, song.id) && Objects.equals(songName, song.songName) && Objects.equals(artistName, song.artistName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, songName, artistName, runtimeSecs);
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", songName='" + songName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", runtimeSecs=" + runtimeSecs +
                '}';
    }
}
