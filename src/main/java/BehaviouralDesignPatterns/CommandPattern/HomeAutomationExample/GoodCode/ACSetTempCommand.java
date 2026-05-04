package BehaviouralDesignPatterns.CommandPattern.HomeAutomationExample.GoodCode;

/**
 * Concrete Command: Set AC Temperature
 */
public class ACSetTempCommand implements Command {
    private AirConditioner ac;
    private int newTemp;

    public ACSetTempCommand(AirConditioner ac, int newTemp) {
        this.ac = ac;
        this.newTemp = newTemp;
    }

    @Override
    public void execute() {
        ac.setTemperature(newTemp);
    }

    @Override
    public void undo() {
        System.out.println("Undoing AC temperature change...");
        ac.turnOff(); // Simplified for demo
    }
}
