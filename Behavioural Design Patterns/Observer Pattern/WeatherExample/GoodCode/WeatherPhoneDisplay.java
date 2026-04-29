/**
 * Concrete Observer: Phone Display
 */
public class PhoneDisplay implements Observer {
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
