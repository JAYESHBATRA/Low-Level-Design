import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Subject: Ride
 * Tracks ride details and notifies all apps (Passenger, Driver, Admin).
 */
public class Ride implements RideSubject {
    private List<RideObserver> observers = new ArrayList<>();
    private String rideId;
    private String status;

    public Ride(String rideId) {
        this.rideId = rideId;
        this.status = "BOOKED";
    }

    @Override
    public void attach(RideObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(RideObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (RideObserver observer : observers) {
            observer.onStatusUpdate(rideId, status);
        }
    }

    public void updateStatus(String status) {
        this.status = status;
        System.out.println("\n[SYSTEM]: Ride " + rideId + " is now " + status);
        notifyObservers();
    }
}
