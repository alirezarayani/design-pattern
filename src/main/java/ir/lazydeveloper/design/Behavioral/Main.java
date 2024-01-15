package ir.lazydeveloper.design.Behavioral;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends JPanel {
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton;

    private JTextFieldHistory jTextFieldHistory;

    public Main() {
        jLabel = new JLabel("Enter Your Name");
        jTextField = new JTextField(20);
        jTextFieldHistory = new JTextFieldHistory(jTextField);
        jButton = new JButton("Save!");
        setLayout(new FlowLayout());
        add(jLabel);
        add(jTextField);
        add(jButton);
        jButton.addActionListener(e -> {
            System.out.println(e);
            jTextFieldHistory.save();
        });
        jTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_Z) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
                    jTextFieldHistory.undo();
                } else if ((e.getKeyCode() == KeyEvent.SHIFT_MASK) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
                    jTextFieldHistory.redo();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Memento Design pattern!");
        jFrame.setSize(800, 200);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.add(new Main());
        jFrame.setVisible(true);

    }
}
