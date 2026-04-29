package CreationalDesignPatterns.FactoryPattern.BadCode;

/**
 * TIGHTLY COUPLED SERVICE (BAD CODE)
 * 
 * This service layer contains the business logic to send a notification.
 * 
 * THE PROBLEM:
 * It manually handles the creation of objects using if-else.
 * If we add a new 'WhatsApp' notification, we MUST change this service class.
 * This violates the Open/Closed Principle and shows why not having a 
 * Factory makes our middle layers unstable.
 */
public class BadNotificationService {
    public void sendNotification(String type, String message) {
        BadFactoryNotification notification;

        // The Service is forced to know every concrete class.
        if (type.equalsIgnoreCase("EMAIL")) {
            notification = new BadFactoryEmailNotification();
        } else if (type.equalsIgnoreCase("SMS")) {
            notification = new BadFactorySMSNotification();
        } else if (type.equalsIgnoreCase("PUSH")) {
            notification = new BadFactoryPushNotification();
        } else {
            throw new IllegalArgumentException("Unknown notification type: " + type);
        }

        notification.notifyUser(message);
    }
}
