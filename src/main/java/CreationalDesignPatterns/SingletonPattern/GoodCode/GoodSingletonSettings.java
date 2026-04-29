package CreationalDesignPatterns.SingletonPattern.GoodCode;

/**
 * BASIC LAZY SINGLETON (GOOD CODE)
 * 
 * This class ensures that only one instance of Settings exists.
 * 
 * THE SOLUTION:
 * 1. Private Constructor: No one can call 'new GoodSingletonSettings()'.
 * 2. Static Instance Field: Holds the single instance.
 * 3. Static Access Method: Returns the single instance (Lazy Loading).
 */
public class GoodSingletonSettings {
    // 1. Static variable to hold the single instance
    private static GoodSingletonSettings instance;

    private String appName;
    private String version;

    // 2. PRIVATE constructor prevents instantiation from outside
    private GoodSingletonSettings() {
        System.out.println("--- Loading Application Settings (Heavy Operation) ---");
        this.appName = "LLD Mastering App";
        this.version = "1.0.0";
    }

    // 3. Static method to get the single instance
    // This is 'Lazy Initialization' - the object is created only when requested.
    public static GoodSingletonSettings getInstance() {
        if (instance == null) {
            instance = new GoodSingletonSettings();
        }
        return instance;
    }

    public void displayConfig() {
        System.out.println("App Name: " + appName + ", Version: " + version);
    }
}
