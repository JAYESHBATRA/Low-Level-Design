package BehaviouralDesignPatterns.CommandPattern.TextEditorExample.GoodCode;

/**
 * Concrete Command: Insert Text
 */
class InsertTextCommand implements UndoableCommand {
    private Document doc;
    private String text;
    private int position;

    public InsertTextCommand(Document doc, String text, int position) {
        this.doc = doc;
        this.text = text;
        this.position = position;
    }

    @Override
    public void execute() {
        doc.insert(position, text);
    }

    @Override
    public void undo() {
        doc.delete(position, text.length());
    }
}

/**
 * UndoableCommand Interface
 */
interface UndoableCommand {
    void execute();
    void undo();
}
