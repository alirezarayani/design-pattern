package ir.lazydeveloper.design.Behavioral.memento;

/**
 * Created by A_RAYANI on 1/15/2024
 */
public class JTextFieldMemento {
    private String text;

    public JTextFieldMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public JTextFieldMemento setText(String text) {
        this.text = text;
        return this;
    }
}
