package BehaviouralDesignPatterns.CommandPattern.HomeAutomationExample.BadCode;

/**
 * Receiver 1: Light
 */
class Light {
    public void turnOn() { System.out.println("Light is ON"); }
    public void turnOff() { System.out.println("Light is OFF"); }
}

/**
 * Receiver 2: Air Conditioner
 */
class AirConditioner {
    public void setTemperature(int temp) { System.out.println("AC Temperature set to " + temp); }
    public void turnOff() { System.out.println("AC is OFF"); }
}

/**
 * VIOLATION: Tight Coupling.
 * The Remote is hardcoded to specific devices.
 * Adding a new device requires modifying this class.
 */
class BadRemoteControl {
    private Light light;
    private AirConditioner ac;

    public BadRemoteControl(Light light, AirConditioner ac) {
        this.light = light;
        this.ac = ac;
    }

    public void pressButton(String action) {
        if (action.equalsIgnoreCase("LIGHT_ON")) {
            light.turnOn();
        } else if (action.equalsIgnoreCase("LIGHT_OFF")) {
            light.turnOff();
        } else if (action.equalsIgnoreCase("AC_ON")) {
            ac.setTemperature(24);
        } else if (action.equalsIgnoreCase("AC_OFF")) {
            ac.turnOff();
        }
        // PROBLEM: If we add a SmartFan, we must add more if-else blocks here.
    }
}

public class BadCommandMain {
    public static void main(String[] args) {
        Light light = new Light();
        AirConditioner ac = new AirConditioner();
        BadRemoteControl remote = new BadRemoteControl(light, ac);

        System.out.println("--- Bad Command Pattern Demo ---");
        remote.pressButton("LIGHT_ON");
        remote.pressButton("AC_ON");
    }
}
