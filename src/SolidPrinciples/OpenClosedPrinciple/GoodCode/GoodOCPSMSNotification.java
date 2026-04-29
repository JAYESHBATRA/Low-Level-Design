package SolidPrinciples.OpenClosedPrinciple.GoodCode;

public class GoodOCPSMSNotification implements GoodOCPNotificationMedium {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
