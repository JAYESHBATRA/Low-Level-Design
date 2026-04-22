/**
 * Concrete Implementation of a Notification.
 * In Bad Code, these are fine, but the Client shouldn't have to name them specifically.
 */
public class BadFactoryEmailNotification implements BadFactoryNotification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Email: " + message);
    }
}
