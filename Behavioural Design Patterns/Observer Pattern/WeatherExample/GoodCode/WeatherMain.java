/**
 * Main Class: Demonstration of Observer Pattern for Weather Monitoring
 */
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Create Observers
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        TVDisplay tvDisplay = new TVDisplay();

        // Register Observers
        weatherStation.registerObserver(phoneDisplay);
        weatherStation.registerObserver(tvDisplay);

        // Update Measurements
        System.out.println("--- Update 1: 30°C, 65% Humidity ---");
        weatherStation.setMeasurements(30, 65);

        // Remove an observer and update again
        System.out.println("\n--- Update 2: Removing TV Display, 32°C, 70% Humidity ---");
        weatherStation.removeObserver(tvDisplay);
        weatherStation.setMeasurements(32, 70);
    }
}
