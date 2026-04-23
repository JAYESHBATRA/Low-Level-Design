/**
 * MULTIPLE INSTANCE PROBLEM (BAD CODE)
 * 
 * This class represents a heavy resource (like a DB connection).
 * 
 * THE PROBLEM:
 * Because the constructor is public, any developer can call 'new BadDatabaseConnection()' 
 * as many times as they want. Every call creates a NEW object in memory.
 */
public class BadDatabaseConnection {
    public BadDatabaseConnection() {
        System.out.println("--- Opening a heavy Database Connection ---");
    }
}
