/**
 * Concrete Observer: PassengerApp
 */
public class PassengerApp implements RideObserver {
    private String rideId;
    private String status;

    @Override
    public void onStatusUpdate(String rideId, String status) {
        this.rideId = rideId;
        this.status = status;
        display();
    }

    public void display() {
        System.out.println("PASSENGER APP: Ride " + rideId + " is now " + status + ". Updating UI for user.");
    }
}
