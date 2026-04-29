package BehaviouralDesignPatterns.ObserverPattern.WeatherExample.BadCode;

/**
 * VIOLATION: Tight Coupling
 * This WeatherStation class is tightly coupled to PhoneDisplay and TVDisplay.
 * If we want to add a new display (e.g., WebDisplay), we have to modify this class.
 */
public class BadWeatherStation {
    // Hardcoded dependencies
    private PhoneDisplay phoneDisplay = new PhoneDisplay();
    private TVDisplay tvDisplay = new TVDisplay();

    public void setMeasurements(float temperature, float humidity) {
        // Manually updating each display - brittle and not scalable
        phoneDisplay.update(temperature, humidity);
        tvDisplay.update(temperature, humidity);
    }
}

class PhoneDisplay {
    public void update(float temp, float humidity) {
        System.out.println("Phone Display: Temp = " + temp + ", Humidity = " + humidity);
    }
}

class TVDisplay {
    public void update(float temp, float humidity) {
        System.out.println("TV Display: Temp = " + temp + ", Humidity = " + humidity);
    }
}
