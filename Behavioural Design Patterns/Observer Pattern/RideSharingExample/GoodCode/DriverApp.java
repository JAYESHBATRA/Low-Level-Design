/**
 * Concrete Observer: DriverApp
 */
public class DriverApp implements RideObserver {
    private String rideId;
    private String status;

    @Override
    public void onStatusUpdate(String rideId, String status) {
        this.rideId = rideId;
        this.status = status;
        display();
    }

    public void display() {
        System.out.println("DRIVER APP: Ride " + rideId + " status changed to " + status + ". Notifying Driver.");
    }
}
