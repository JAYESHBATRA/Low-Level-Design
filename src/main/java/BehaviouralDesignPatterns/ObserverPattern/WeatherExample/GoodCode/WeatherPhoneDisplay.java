package BehaviouralDesignPatterns.ObserverPattern.WeatherExample.GoodCode;

/**
 * Concrete Observer: Phone Display
 */
public class WeatherPhoneDisplay implements WeatherObserver {
    private float temperature;
    private float humidity;

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Phone Display (Weather): " + temperature + "°C and " + humidity + "% humidity");
    }
}
