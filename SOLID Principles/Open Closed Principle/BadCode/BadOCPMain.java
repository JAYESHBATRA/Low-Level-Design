public class BadOCPMain {
    public static void main(String[] args) {
        BadOCPNotificationService service = new BadOCPNotificationService();
        
        service.sendNotification("Email", "Hello via Email!");
        service.sendNotification("SMS", "Hello via SMS!");
        
        // Want to add WhatsApp? 
        // 1. Go to BadOCPNotificationService
        // 2. Add another if-else
        // 3. Re-test the whole service
        // 4. Then call it here.
    }
}
