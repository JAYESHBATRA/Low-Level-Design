package BehaviouralDesignPatterns.IteratorPattern.BookShelfExample.GoodCode;

/**
 * Main Class: Demonstration
 */
public class BookShelfMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        
        bookShelf.addBook(new Book("Design Patterns: Elements of Reusable Object-Oriented Software"));
        bookShelf.addBook(new Book("Clean Code"));
        bookShelf.addBook(new Book("The Pragmatic Programmer"));
        bookShelf.addBook(new Book("Refactoring"));

        System.out.println("--- Forward Iteration ---");
        Iterator forward = bookShelf.createIterator(BookShelfIteratorType.FORWARD);
        while (forward.hasNext()) {
            Book book = (Book) forward.next();
            System.out.println("Book: " + book.getName());
        }

        System.out.println("\n--- Reverse Iteration ---");
        Iterator reverse = bookShelf.createIterator(BookShelfIteratorType.REVERSE);
        while (reverse.hasNext()) {
            Book book = (Book) reverse.next();
            System.out.println("Book: " + book.getName());
        }

        /**
         * TAKEAWAY:
         * 1. The Iterator holds a reference to the 'bookShelf' object itself.
         * 2. The Iterator 'asks' the bookshelf for its length and books.
         * 3. This implementation is 'live'—if we added a book while iterating, 
         *    the iterator might see it!
         */
    }
}
