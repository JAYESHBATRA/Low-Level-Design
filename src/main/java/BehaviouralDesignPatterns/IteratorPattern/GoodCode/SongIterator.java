package BehaviouralDesignPatterns.IteratorPattern.GoodCode;

/**
 * Iterator Interface
 */
public interface SongIterator {
    boolean hasNext();
    Song next();
}
