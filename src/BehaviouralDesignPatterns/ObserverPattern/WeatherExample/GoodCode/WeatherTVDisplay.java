package BehaviouralDesignPatterns.ObserverPattern.WeatherExample.GoodCode;

/**
 * Concrete Observer: TV Display
 */
public class WeatherTVDisplay implements WeatherObserver {
    private float temperature;
    private float humidity;

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("TV Display (Weather): " + temperature + "°C with " + humidity + "% humidity");
    }
}
