package BehaviouralDesignPatterns.CommandPattern.HomeAutomationExample.GoodCode;

/**
 * Main Class: Demonstration
 */
public class HomeAutomationMain {
    public static void main(String[] args) {
        // 1. Setup Receivers
        Light livingRoomLight = new Light();
        AirConditioner bedroomAC = new AirConditioner();

        // 2. Setup Commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command acTemp22 = new ACSetTempCommand(bedroomAC, 22);

        // 3. Setup Invoker
        RemoteControl remote = new RemoteControl();

        System.out.println("--- Good Command Pattern Demo ---");
        
        // Use Light
        remote.setCommand(lightOn);
        remote.pressButton();

        // Use AC
        remote.setCommand(acTemp22);
        remote.pressButton();

        // Undo
        System.out.println("\n--- Undo Operations ---");
        remote.pressUndo(); // Undoes AC
        remote.pressUndo(); // Undoes Light
    }
}
