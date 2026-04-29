package BehaviouralDesignPatterns.IteratorPattern.BookShelfExample.GoodCode;

/**
 * Concrete Iterator: BookShelfIterator
 * This implementation reaches back into the BookShelf object to get data.
 */
public class ForwardBookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public ForwardBookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            Book book = bookShelf.getBookAt(index);
            index++;
            return book;
        }
        return null;
    }
}
