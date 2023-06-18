public class TextEditorCalc {
    public static void main(String args[]) {
        TextEditor textEditorObj = new TextEditor("Hello");
        textEditorObj.addText(" World");
        textEditorObj.addText("!");
        textEditorObj.printText();
    }
}

class TextEditor {
    String text;

    public TextEditor(String text) {
        this.text = text;
    }

    void addText(String text) {
        this.text += text;
    }

    void printText() {
        System.out.println(text);
    }
}
