package SolidPrinciples.DependencyInversionPrinciple.BadCode;

/**
 * HIGH-LEVEL MODULE (VIOLATION)
 * 
 * This class is tightly coupled to the low-level MySQL class.
 * It manually creates a concrete instance of BadDIPMySQLDatabase.
 */
public class BadDIPUserSyncService {
    private BadDIPMySQLDatabase database;

    public BadDIPUserSyncService() {
        // VIOLATION: Creating the dependency manually. 
        // This makes this service depend on a concrete implementation.
        this.database = new BadDIPMySQLDatabase();
    }

    public void sync(String userData) {
        database.insert(userData);
    }
}
