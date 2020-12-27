package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorButtonPanel extends JPanel {
    private JButton zeroButton;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton initialButton;
    private JButton equalButton;
    private JButton plusButton;
    private JButton minusButton;
    private JButton multiplicationButton;
    private JButton divisionButton;


    public CalculatorButtonPanel(ActionListener actionListener) {
        this.setLayout(new GridLayout(4,4));

        this.zeroButton = new JButton("0");
        this.zeroButton.setActionCommand("0");
        this.zeroButton.addActionListener(actionListener);
        this.oneButton = new JButton("1");
        this.oneButton.setActionCommand("1");
        this.oneButton.addActionListener(actionListener);
        this.twoButton = new JButton("2");
        this.twoButton.setActionCommand("2");
        this.twoButton.addActionListener(actionListener);
        this.threeButton = new JButton("3");
        this.threeButton.setActionCommand("3");
        this.threeButton.addActionListener(actionListener);
        this.fourButton = new JButton("4");
        this.fourButton.setActionCommand("4");
        this.fourButton.addActionListener(actionListener);
        this.fiveButton = new JButton("5");
        this.fiveButton.setActionCommand("5");
        this.fiveButton.addActionListener(actionListener);
        this.sixButton = new JButton("6");
        this.sixButton.setActionCommand("6");
        this.sixButton.addActionListener(actionListener);
        this.sevenButton = new JButton("7");
        this.sevenButton.setActionCommand("7");
        this.sevenButton.addActionListener(actionListener);
        this.eightButton = new JButton("8");
        this.eightButton.setActionCommand("8");
        this.eightButton.addActionListener(actionListener);
        this.nineButton = new JButton("9");
        this.nineButton.setActionCommand("9");
        this.nineButton.addActionListener(actionListener);
        this.initialButton = new JButton("C");
        this.initialButton.setActionCommand("C");
        this.initialButton.addActionListener(actionListener);
        this.equalButton = new JButton("=");
        this.equalButton.setActionCommand("=");
        this.equalButton.addActionListener(actionListener);
        this.plusButton = new JButton("+");
        this.plusButton.setActionCommand("+");
        this.plusButton.addActionListener(actionListener);
        this.minusButton = new JButton("-");
        this.minusButton.setActionCommand("-");
        this.minusButton.addActionListener(actionListener);
        this.multiplicationButton = new JButton("X");
        this.multiplicationButton.setActionCommand("X");
        this.multiplicationButton.addActionListener(actionListener);
        this.divisionButton = new JButton("/");
        this.divisionButton.setActionCommand("/");
        this.divisionButton.addActionListener(actionListener);

        this.add(this.sevenButton);
        this.add(this.eightButton);
        this.add(this.nineButton);
        this.add(this.plusButton);
        this.add(this.fourButton);
        this.add(this.fiveButton);
        this.add(this.sixButton);
        this.add(this.minusButton);
        this.add(this.oneButton);
        this.add(this.twoButton);
        this.add(this.threeButton);
        this.add(this.multiplicationButton);
        this.add(this.zeroButton);
        this.add(this.initialButton);
        this.add(this.equalButton);
        this.add(this.divisionButton);
    }

    public void initialize() {
    }
}
