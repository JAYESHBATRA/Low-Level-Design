package CreationalDesignPatterns.SingletonPattern.GoodCode;

public class GoodSingletonMain {
    public static void main(String[] args) {
        // We cannot use 'new GoodSingletonSettings()' here (constructor is private)

        // All parts of the app get the same instance via getInstance()
        GoodSingletonSettings s1 = GoodSingletonSettings.getInstance();
        GoodSingletonSettings s2 = GoodSingletonSettings.getInstance();
        
        System.out.println("\nChecking if settings are the same object:");
        // In Java, == on objects checks if they point to the exact same memory address
        System.out.println("s1 == s2: " + (s1 == s2)); // Should be true

        s1.displayConfig();
        s2.displayConfig();

        /**
         * SUCCESS: 
         * No matter how many times we call getInstance(), 
         * we only pay the cost of object creation ONCE.
         */
    }
}
