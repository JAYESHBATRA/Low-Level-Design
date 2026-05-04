package BehaviouralDesignPatterns.CommandPattern.HomeAutomationExample.GoodCode;

import java.util.Stack;

/**
 * Invoker: Remote Control
 * It just executes commands and can track history for undo.
 */
public class RemoteControl {
    private Command slot;
    private Stack<Command> history = new Stack<>();

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void pressButton() {
        if (slot != null) {
            slot.execute();
            history.push(slot);
        }
    }

    public void pressUndo() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo");
        }
    }
}
