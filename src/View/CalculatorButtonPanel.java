package View;

import javax.swing.*;
import java.awt.*;

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


    public CalculatorButtonPanel() {
        this.setLayout(new GridLayout(4,4));

        this.zeroButton = new JButton("0");
        this.oneButton = new JButton("1");
        this.twoButton = new JButton("2");
        this.threeButton = new JButton("3");
        this.fourButton = new JButton("4");
        this.fiveButton = new JButton("5");
        this.sixButton = new JButton("6");
        this.sevenButton = new JButton("7");
        this.eightButton = new JButton("8");
        this.nineButton = new JButton("9");
        this.initialButton = new JButton("C");
        this.equalButton = new JButton("=");
        this.plusButton = new JButton("+");
        this.minusButton = new JButton("-");
        this.multiplicationButton = new JButton("X");
        this.divisionButton = new JButton("/");

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
}
