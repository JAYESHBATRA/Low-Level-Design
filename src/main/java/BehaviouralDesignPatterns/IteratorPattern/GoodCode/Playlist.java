package BehaviouralDesignPatterns.IteratorPattern.GoodCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Aggregate: Playlist
 */
public class Playlist {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public SongIterator createSequentialIterator() {
        return new SequentialIterator(songs);
    }

    public SongIterator createShuffleIterator() {
        return new ShuffleIterator(songs);
    }
}
