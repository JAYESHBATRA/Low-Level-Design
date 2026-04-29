package CreationalDesignPatterns.SingletonPattern.BadCode;

public class BadSingletonMain {
    public static void main(String[] args) {
        // Creating multiple instances unnecessarily
        BadDatabaseConnection conn1 = new BadDatabaseConnection();
        BadDatabaseConnection conn2 = new BadDatabaseConnection();
        BadDatabaseConnection conn3 = new BadDatabaseConnection();

        System.out.println("\nChecking if connections are the same object:");
        System.out.println("conn1 == conn2: " + (conn1 == conn2)); // false
        System.out.println("conn2 == conn3: " + (conn2 == conn3)); // false

        // In a real app, this would waste RAM and socket connections.
    }
}
