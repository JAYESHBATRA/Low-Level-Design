package BehaviouralDesignPatterns.CommandPattern.HomeAutomationExample.GoodCode;

/**
 * Command Interface
 */
public interface Command {
    void execute();
    void undo();
}
