package BehaviouralDesignPatterns.IteratorPattern.BookShelfExample.GoodCode;

/**
 * Common Aggregate Interface (Collection)
 */
public interface Aggregate {
    Iterator createIterator(BookShelfIteratorType type);
}
