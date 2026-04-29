/**
 * Concrete Observer: AdminDashboard
 */
public class AdminDashboard implements RideObserver {
    private String rideId;
    private String status;

    @Override
    public void onStatusUpdate(String rideId, String status) {
        this.rideId = rideId;
        this.status = status;
        display();
    }

    public void display() {
        System.out.println("ADMIN DASHBOARD: Logging update for Ride " + rideId + ": " + status);
    }
}
