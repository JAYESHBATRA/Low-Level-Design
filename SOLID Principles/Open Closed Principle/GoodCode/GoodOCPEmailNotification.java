public class GoodOCPEmailNotification implements GoodOCPNotificationMedium {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
