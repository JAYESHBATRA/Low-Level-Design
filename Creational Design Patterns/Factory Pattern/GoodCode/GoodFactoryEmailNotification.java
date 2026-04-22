/**
 * Concrete Implementation.
 * This class is 'hidden' from the client by the Factory.
 */
public class GoodFactoryEmailNotification implements GoodFactoryNotification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Email: " + message);
    }
}
