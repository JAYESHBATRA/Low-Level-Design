/**
 * THE CLIENT CODE
 * 
 * In this 3-layer setup (Main -> Service -> Creation), 
 * the Main class is simple, but the Service is still "Bad" because it 
 * handles creation internally.
 */
public class BadFactoryMain {
    public static void main(String[] args) {
        BadNotificationService service = new BadNotificationService();

        // Main passes the 'type' string to the service
        service.sendNotification("EMAIL", "Your order is confirmed!");
        service.sendNotification("SMS", "Your delivery is arriving today.");
    }
}
