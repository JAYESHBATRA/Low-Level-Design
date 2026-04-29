package BehaviouralDesignPatterns.IteratorPattern.BookShelfExample.GoodCode;

/**
 * Concrete Iterator: ReverseBookShelfIterator
 * Traverses the bookshelf from the last book to the first.
 */
public class ReverseBookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public ReverseBookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        // Start at the last index
        this.index = bookShelf.getLength() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            Book book = bookShelf.getBookAt(index);
            index--;
            return book;
        }
        return null;
    }
}
