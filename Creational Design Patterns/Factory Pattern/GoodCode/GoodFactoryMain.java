/**
 * THE CLIENT CODE
 * 
 * In this professional setup, Main assembles the dependencies 
 * (DIP) and then uses the Service to perform work.
 */
public class GoodFactoryMain {
    public static void main(String[] args) {
        // 1. Initialize the Factory (the creation engine)
        GoodNotificationFactory factory = new GoodNotificationFactory();

        // 2. Initialize the Service and inject the factory
        GoodNotificationService service = new GoodNotificationService(factory);

        // 3. User only interacts with the Service
        service.sendNotification("EMAIL", "Your order has been shipped!");
        service.sendNotification("SMS", "Your delivery is arriving today.");
        service.sendNotification("PUSH", "New deals are available!");
    }
}
