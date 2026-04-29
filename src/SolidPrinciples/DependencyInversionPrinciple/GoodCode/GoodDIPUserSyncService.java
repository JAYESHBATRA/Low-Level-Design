package SolidPrinciples.DependencyInversionPrinciple.GoodCode;

/**
 * HIGH-LEVEL MODULE (ADHERENT TO DIP)
 * 
 * This service depends on the GoodDIPDatabase abstraction,
 * NOT a concrete class.
 */
public class GoodDIPUserSyncService {
    private GoodDIPDatabase database;

    // CONSTRUCTOR INJECTION
    // We pass the dependency as an argument.
    public GoodDIPUserSyncService(GoodDIPDatabase database) {
        this.database = database;
    }

    public void sync(String userData) {
        database.saveData(userData);
    }
}
