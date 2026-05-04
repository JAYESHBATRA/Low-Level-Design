package BehaviouralDesignPatterns.CommandPattern.HomeAutomationExample.GoodCode;

/**
 * Concrete Command: Turn Light On
 */
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) { this.light = light; }

    @Override
    public void execute() { light.turnOn(); }

    @Override
    public void undo() { light.turnOff(); }
}

/**
 * Concrete Command: Turn Light Off
 */
class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) { this.light = light; }

    @Override
    public void execute() { light.turnOff(); }

    @Override
    public void undo() { light.turnOn(); }
}

/**
 * Concrete Command: Set AC Temperature
 */
class ACSetTempCommand implements Command {
    private AirConditioner ac;
    private int prevTemp;
    private int newTemp;

    public ACSetTempCommand(AirConditioner ac, int newTemp) {
        this.ac = ac;
        this.newTemp = newTemp;
    }

    @Override
    public void execute() {
        // In a real system, we'd get the current temp from AC before changing it
        ac.setTemperature(newTemp);
    }

    @Override
    public void undo() {
        System.out.println("Undoing AC temperature change...");
        ac.turnOff(); // Simplified for demo
    }
}
