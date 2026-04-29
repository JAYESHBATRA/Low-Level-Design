package CreationalDesignPatterns.FactoryPattern.BadCode;

/**
 * Another concrete implementation.
 * Again, the issue is that the Client (Main) will have to know this name.
 */
public class BadFactorySMSNotification implements BadFactoryNotification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
