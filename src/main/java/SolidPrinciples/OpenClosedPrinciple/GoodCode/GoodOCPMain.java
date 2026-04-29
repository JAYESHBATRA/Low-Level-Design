package SolidPrinciples.OpenClosedPrinciple.GoodCode;

public class GoodOCPMain {
    public static void main(String[] args) {
        GoodOCPNotificationService service = new GoodOCPNotificationService();
        
        // Sending Email
        GoodOCPNotificationMedium email = new GoodOCPEmailNotification();
        service.send(email, "Hello via Email!");
        
        // Sending SMS
        GoodOCPNotificationMedium sms = new GoodOCPSMSNotification();
        service.send(sms, "Hello via SMS!");

        /**
         * WANT TO ADD WHATSAPP?
         * 1. Create a NEW class: GoodOCPWhatsAppNotification implements GoodOCPNotificationMedium.
         * 2. Call it here.
         * 
         * NO CHANGES NEEDED to GoodOCPNotificationService.java!
         * This satisfies the Open Closed Principle.
         */
    }
}
