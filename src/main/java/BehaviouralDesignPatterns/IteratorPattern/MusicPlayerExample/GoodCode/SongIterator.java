package BehaviouralDesignPatterns.IteratorPattern.MusicPlayerExample.GoodCode;

/**
 * Iterator Interface
 */
public interface SongIterator {
    boolean hasNext();
    Song next();
}
