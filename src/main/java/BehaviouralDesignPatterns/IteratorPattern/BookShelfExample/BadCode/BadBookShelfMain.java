package BehaviouralDesignPatterns.IteratorPattern.BookShelfExample.BadCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Data Model: BadBook
 */
class BadBook {
    private String name;
    public BadBook(String name) { this.name = name; }
    public String getName() { return name; }
}

/**
 * VIOLATION: Exposing internal structure.
 */
class BadBookShelf {
    private List<BadBook> books = new ArrayList<>();
    public void addBook(BadBook book) { books.add(book); }
    
    // Violation: Exposing the list
    public List<BadBook> getBooks() { return books; }
}

/**
 * Main Class: Demonstration of why this is bad.
 */
public class BadBookShelfMain {
    public static void main(String[] args) {
        BadBookShelf shelf = new BadBookShelf();
        shelf.addBook(new BadBook("Design Patterns"));
        shelf.addBook(new BadBook("Clean Code"));

        System.out.println("--- Bad BookShelf: Client-side iteration ---");
        
        // Client has to know it's a List and how to iterate
        List<BadBook> books = shelf.getBooks();
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Book: " + books.get(i).getName());
        }

        /**
         * PROBLEM:
         * If the shelf changes from List to an Array or a custom Binary Tree 
         * storage, this client loop will BREAK.
         */
    }
}
