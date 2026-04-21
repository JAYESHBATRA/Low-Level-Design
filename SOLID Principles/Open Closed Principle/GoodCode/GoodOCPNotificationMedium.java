/**
 * Interface defining the base behavior for all notification mediums.
 * This is the "Abstraction" that makes the system Open for Extension.
 */
public interface GoodOCPNotificationMedium {
    void send(String message);
}
