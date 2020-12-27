package View;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class CalculatorShowPanel extends JPanel {

    private final JTextPane textPane;

    public CalculatorShowPanel() {
        this.setLayout(new BorderLayout());
        this.textPane = new JTextPane();
        this.textPane.setEditable(false);

        StyledDocument doc = this.textPane.getStyledDocument();
        SimpleAttributeSet right = new SimpleAttributeSet();
        StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
        doc.setParagraphAttributes(0, doc.getLength(), right, false);

        this.textPane.setFont(new Font("Serif", Font.PLAIN, 30));
        this.add(this.textPane,BorderLayout.CENTER);
    }

    public JTextPane getTextPane() {
        return textPane;
    }

    public void initialize() {
        this.textPane.setText("0");
    }
}
