/**
 * Main Class: Demonstration of Observer Pattern for Ride Sharing
 */
public class RideSharingMain {
    public static void main(String[] args) {
        Ride ride = new Ride("UBER-123");

        // Create Observers
        PassengerApp passengerApp = new PassengerApp();
        DriverApp driverApp = new DriverApp();
        AdminDashboard adminDashboard = new AdminDashboard();

        // Attach Observers
        ride.attach(passengerApp);
        ride.attach(driverApp);
        ride.attach(adminDashboard);

        // Status Transitions
        ride.updateStatus("DRIVER_ARRIVED");
        ride.updateStatus("STARTED");
        ride.updateStatus("COMPLETED");
    }
}
