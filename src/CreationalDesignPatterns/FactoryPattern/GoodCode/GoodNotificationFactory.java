package CreationalDesignPatterns.FactoryPattern.GoodCode;

/**
 * THE FACTORY CLASS
 * 
 * This class encapsulates the object creation logic.
 * It follows the 'Factory Method' pattern principle by isolating 
 * the instantiation of concrete objects.
 * 
 * BENEFITS:
 * 1. The 'new' keyword for notifications is used ONLY here.
 * 2. If the constructor of a class (like EmailNotification) changes, only this 
 *    factory needs to be updated. The CLIENT CODE (Main) remains unaffected.
 * 3. Adding a new notification type (like WhatsApp) is simple: Create the class 
 *    and add a new case here. No other part of the system needs to change.
 */
public class GoodNotificationFactory {
    /**
     * Factory Method to create notifications.
     * @param type The string identifying the desired notification type.
     * @return A concrete object implementing GoodFactoryNotification.
     */
    public GoodFactoryNotification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        
        switch (type.toUpperCase()) {
            case "EMAIL":
                return new GoodFactoryEmailNotification();
            case "SMS":
                return new GoodFactorySMSNotification();
            case "PUSH":
                return new GoodFactoryPushNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
}
