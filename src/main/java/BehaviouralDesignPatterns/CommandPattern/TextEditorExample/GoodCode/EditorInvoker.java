package BehaviouralDesignPatterns.CommandPattern.TextEditorExample.GoodCode;

import java.util.Stack;

/**
 * Invoker: Editor
 * Manages the history of commands for undo/redo.
 */
public class EditorInvoker {
    private Stack<UndoableCommand> history = new Stack<>();

    public void executeCommand(UndoableCommand command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (!history.isEmpty()) {
            UndoableCommand command = history.pop();
            command.undo();
        } else {
            System.out.println("Nothing to undo.");
        }
    }
}
