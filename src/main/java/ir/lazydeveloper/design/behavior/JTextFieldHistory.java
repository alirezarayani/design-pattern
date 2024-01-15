package ir.lazydeveloper.design.behavior;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Objects;

/**
 * Created by A_RAYANI on 1/15/2024
 */

//Caretaker
public class JTextFieldHistory {
    private final LinkedList<JTextFieldMemento> mementos = new LinkedList<>();
    private final JTextField jTextField;

    public JTextFieldHistory(JTextField jTextField) {
        Objects.requireNonNull(jTextField);
        this.jTextField = jTextField;
    }

    public void save() {
        mementos.push(new JTextFieldMemento(jTextField.getText()));
        jTextField.setText("");
    }

    public void undo() {
        if (!mementos.isEmpty()) {
            jTextField.setText(mementos.pop().getText());
        } else {
            jTextField.setText("");
        }
    }

}
