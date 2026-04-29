/**
 * VIOLATION: Tight Coupling & Open-Closed Principle
 * The Ride class is aware of specific application types (PassengerApp, DriverApp).
 */
public class BadRide {
    private PassengerApp passengerApp = new PassengerApp();
    private DriverApp driverApp = new DriverApp();
    private AdminDashboard adminDashboard = new AdminDashboard();

    public void updateStatus(String newStatus) {
        // Manual updates to specific systems
        passengerApp.notifyPassenger(newStatus);
        driverApp.notifyDriver(newStatus);
        adminDashboard.logUpdate(newStatus);
    }
}

class PassengerApp {
    public void notifyPassenger(String status) {
        System.out.println("Passenger App: Your ride status is now " + status);
    }
}

class DriverApp {
    public void notifyDriver(String status) {
        System.out.println("Driver App: Ride status updated to " + status);
    }
}

class AdminDashboard {
    public void logUpdate(String status) {
        System.out.println("Admin Dashboard: LOGGING - Ride status changed to " + status);
    }
}
