package BehaviouralDesignPatterns.CommandPattern.TextEditorExample.GoodCode;

/**
 * Receiver: Document
 * This is the object being modified.
 */
public class Document {
    private StringBuilder content = new StringBuilder();

    public void insert(int position, String text) {
        content.insert(position, text);
    }

    public void delete(int position, int length) {
        content.delete(position, position + length);
    }

    public String getContent() {
        return content.toString();
    }
}
