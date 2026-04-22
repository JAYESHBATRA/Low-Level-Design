/**
 * Concrete Implementation.
 * Easy to add more of these without breaking the client!
 */
public class GoodFactoryPushNotification implements GoodFactoryNotification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}
