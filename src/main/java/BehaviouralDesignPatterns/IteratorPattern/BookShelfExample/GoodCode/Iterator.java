package BehaviouralDesignPatterns.IteratorPattern.BookShelfExample.GoodCode;

/**
 * Common Iterator Interface
 */
public interface Iterator {
    boolean hasNext();
    Object next();
}
