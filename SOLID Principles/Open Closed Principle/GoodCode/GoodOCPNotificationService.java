/**
 * ADHERING TO OPEN CLOSED PRINCIPLE (OCP)
 * 
 * This service class is CLOSED for modification.
 * 
 * We never have to change this class, no matter how many new notification 
 * mediums we add. As long as they implement GoodOCPNotificationMedium, 
 * this service will work with them.
 */
public class GoodOCPNotificationService {
    public void send(GoodOCPNotificationMedium medium, String message) {
        medium.send(message);
    }
}
