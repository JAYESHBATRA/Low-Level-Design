package BehaviouralDesignPatterns.ObserverPattern.WeatherExample.GoodCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Subject: WeatherStation
 * Keeps track of its observers and notifies them when data changes.
 */
public class WeatherStation implements WeatherSubject {
    private List<WeatherObserver> observers;
    private float temperature;
    private float humidity;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(WeatherObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(WeatherObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity);
        }
    }

    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers(); // Automatically notify observers when state changes
    }
}
