package SolidPrinciples.OpenClosedPrinciple.BadCode;

/**
 * VIOLATION OF OPEN CLOSED PRINCIPLE (OCP)
 * 
 * This class uses if-else logic to handle different notification types.
 * 
 * PROBLEM: 
 * If we want to add "WhatsApp" or "Slack" notifications, we MUST modify 
 * this existing, tested class. This makes the class "Open for Modification",
 * which is exactly what OCP tries to avoid.
 */
public class BadOCPNotificationService {
    public void sendNotification(String medium, String message) {
        if (medium.equals("Email")) {
            System.out.println("Sending Email: " + message);
        } else if (medium.equals("SMS")) {
            System.out.println("Sending SMS: " + message);
        }
        /**
         * To add WhatsApp, I would have to add:
         * else if (medium.equals("WhatsApp")) { ... }
         * 
         * This code is NOT closed for modification.
         */
    }
}
