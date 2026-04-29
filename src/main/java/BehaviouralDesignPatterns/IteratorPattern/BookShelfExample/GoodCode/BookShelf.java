package BehaviouralDesignPatterns.IteratorPattern.BookShelfExample.GoodCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Aggregate: BookShelf
 */
public class BookShelf implements Aggregate {
    private List<Book> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator createIterator(BookShelfIteratorType type) {
        switch (type) {
            case REVERSE:
                return new ReverseBookShelfIterator(this);
            case FORWARD:
            default:
                return new ForwardBookShelfIterator(this);
        }
    }
}
