package BehaviouralDesignPatterns.CommandPattern.TextEditorExample.GoodCode;

/**
 * Main Class: Demonstration
 */
public class TextEditorMain {
    public static void main(String[] args) {
        Document myDoc = new Document();
        EditorInvoker editor = new EditorInvoker();

        System.out.println("--- Text Editor Undo Demo ---");

        // Step 1: Type some text
        editor.executeCommand(new InsertTextCommand(myDoc, "Hello ", 0));
        editor.executeCommand(new InsertTextCommand(myDoc, "World!", 6));
        System.out.println("Content: " + myDoc.getContent());

        // Step 2: Undo last action
        System.out.println("\nUndoing...");
        editor.undo();
        System.out.println("Content: " + myDoc.getContent());

        // Step 3: Undo again
        System.out.println("Undoing...");
        editor.undo();
        System.out.println("Content: " + myDoc.getContent());
    }
}
