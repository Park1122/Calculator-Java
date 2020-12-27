package View;

import javax.swing.*;

public class CalculatorFrame extends JFrame {
    private final int width = 350;
    private final int height = 500;
    private final String title = "Calculator";

    private CalculatorShowPanel calculatorShowPanel;
    private CalculatorButtonPanel calculatorButtonPanel;

    public CalculatorFrame() {
        this.setSize(width,height);
//        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle(title);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.calculatorShowPanel = new CalculatorShowPanel();
        this.calculatorButtonPanel = new CalculatorButtonPanel();

        this.calculatorShowPanel.setBounds(0,5,333,50);
        this.calculatorButtonPanel.setBounds(0,60, 333, 400);

        this.add(this.calculatorShowPanel);
        this.add(this.calculatorButtonPanel);
    }
}
