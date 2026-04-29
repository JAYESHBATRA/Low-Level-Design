package BehaviouralDesignPatterns.ObserverPattern.RideSharingExample.GoodCode;

/**
 * Observer Interface: RideObserver
 */
public interface RideObserver {
    void onStatusUpdate(String rideId, String status);
}
