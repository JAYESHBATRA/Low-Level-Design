package CreationalDesignPatterns.FactoryPattern.GoodCode;

/**
 * Concrete Implementation.
 * The client only knows this exists by its 'type' string passed to the factory.
 */
public class GoodFactorySMSNotification implements GoodFactoryNotification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
