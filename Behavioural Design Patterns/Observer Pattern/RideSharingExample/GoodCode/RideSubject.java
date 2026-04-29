/**
 * Subject Interface: RideSubject
 * Manages observers interested in ride updates.
 */
public interface RideSubject {
    void attach(RideObserver observer);
    void detach(RideObserver observer);
    void notifyObservers();
}
