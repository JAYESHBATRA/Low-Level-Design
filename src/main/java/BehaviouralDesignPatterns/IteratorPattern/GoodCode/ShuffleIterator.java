package BehaviouralDesignPatterns.IteratorPattern.GoodCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Concrete Iterator: Shuffle
 * Traverses the playlist in random order.
 */
public class ShuffleIterator implements SongIterator {
    private List<Song> shuffledSongs;
    private int position = 0;

    public ShuffleIterator(List<Song> songs) {
        // Create a copy and shuffle it so we don't modify the original playlist
        this.shuffledSongs = new ArrayList<>(songs);
        Collections.shuffle(this.shuffledSongs);
    }

    @Override
    public boolean hasNext() {
        return position < shuffledSongs.size();
    }

    @Override
    public Song next() {
        return shuffledSongs.get(position++);
    }
}
