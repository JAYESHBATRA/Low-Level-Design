package BehaviouralDesignPatterns.CommandPattern.HomeAutomationExample.GoodCode;

/**
 * Concrete Command: Turn Light Off
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) { this.light = light; }

    @Override
    public void execute() { light.turnOff(); }

    @Override
    public void undo() { light.turnOn(); }
}
