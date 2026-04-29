package BehaviouralDesignPatterns.IteratorPattern.BookShelfExample.GoodCode;

/**
 * Data Model: Book
 */
public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
