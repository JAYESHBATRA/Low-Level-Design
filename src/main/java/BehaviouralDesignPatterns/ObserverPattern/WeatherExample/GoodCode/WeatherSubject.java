package BehaviouralDesignPatterns.ObserverPattern.WeatherExample.GoodCode;

/**
 * Subject Interface
 * Defines methods for managing observers.
 */
public interface WeatherSubject {
    void registerObserver(WeatherObserver o);
    void removeObserver(WeatherObserver o);
    void notifyObservers();
}
