/**
 * A third concrete implementation. 
 * Forced implementation here creates a larger 'knowledge base' for the Client.
 */
public class BadFactoryPushNotification implements BadFactoryNotification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}
