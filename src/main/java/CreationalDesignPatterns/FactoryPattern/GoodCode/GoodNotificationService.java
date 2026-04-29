package CreationalDesignPatterns.FactoryPattern.GoodCode;

/**
 * STABLE BUSINESS SERVICE (GOOD CODE)
 * 
 * This service handles the business logic of sending a notification.
 * 
 * THE BENEFIT:
 * It utilizes the Factory to handle object creation.
 * If we add a new 'WhatsApp' notification or change a constructor, 
 * this SERVICE CLASS DOES NOT CHANGE.
 * It is decoupled from the concrete implementations.
 */
public class GoodNotificationService {
    private final GoodNotificationFactory factory;

    public GoodNotificationService(GoodNotificationFactory factory) {
        this.factory = factory;
    }

    public void sendNotification(String type, String message) {
        // The service doesn't know WHICH class it gets.
        // It only knows it gets something that implements the interface.
        GoodFactoryNotification notification = factory.createNotification(type);
        
        if (notification != null) {
            notification.notifyUser(message);
        }
    }
}
