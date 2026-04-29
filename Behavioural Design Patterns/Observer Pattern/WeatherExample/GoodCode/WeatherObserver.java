/**
 * Observer Interface
 * Defines the contract for all observers that want to receive updates from the Subject.
 */
public interface Observer {
    void update(float temperature, float humidity);
}
