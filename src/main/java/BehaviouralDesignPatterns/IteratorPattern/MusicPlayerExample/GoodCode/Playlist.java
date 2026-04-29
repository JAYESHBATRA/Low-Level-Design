package BehaviouralDesignPatterns.IteratorPattern.MusicPlayerExample.GoodCode;

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

    public SongIterator getIterator(IteratorType type) {
        switch (type) {
            case SHUFFLE:
                return new ShuffleIterator(songs);
            case SEQUENTIAL:
            default:
                return new SequentialIterator(songs);
        }
    }
}
