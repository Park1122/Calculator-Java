package View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {
    private final int width = 350;
    private final int height = 500;
    private final String title = "Calculator";

    private CalculatorShowPanel calculatorShowPanel;
    private CalculatorButtonPanel calculatorButtonPanel;

    public CalculatorFrame() {
        this.setSize(width,height);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle(title);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        ActionListener actionListener = e -> {
            if (e.getActionCommand().equals("0")) {
                if(calculatorShowPanel.getTextPane().getText().equals("0")){
                    calculatorShowPanel.getTextPane().setText("0");
                }else{
                    calculatorShowPanel.getTextPane().setText(calculatorShowPanel.getTextPane().getText() + "0");
                }
            }else if (e.getActionCommand().equals("1")) {
                if(calculatorShowPanel.getTextPane().getText().equals("0")){
                    calculatorShowPanel.getTextPane().setText("1");
                }else{
                    calculatorShowPanel.getTextPane().setText(calculatorShowPanel.getTextPane().getText() + "1");
                }
            }else if (e.getActionCommand().equals("2")) {
                if(calculatorShowPanel.getTextPane().getText().equals("0")){
                    calculatorShowPanel.getTextPane().setText("2");
                }else{
                    calculatorShowPanel.getTextPane().setText(calculatorShowPanel.getTextPane().getText() + "2");
                }
            }else if (e.getActionCommand().equals("3")) {
                if(calculatorShowPanel.getTextPane().getText().equals("0")){
                    calculatorShowPanel.getTextPane().setText("3");
                }else{
                    calculatorShowPanel.getTextPane().setText(calculatorShowPanel.getTextPane().getText() + "3");
                }
            }else if (e.getActionCommand().equals("4")) {
                if(calculatorShowPanel.getTextPane().getText().equals("0")){
                    calculatorShowPanel.getTextPane().setText("4");
                }else{
                    calculatorShowPanel.getTextPane().setText(calculatorShowPanel.getTextPane().getText() + "4");
                }
            }else if (e.getActionCommand().equals("5")) {
                if(calculatorShowPanel.getTextPane().getText().equals("0")){
                    calculatorShowPanel.getTextPane().setText("5");
                }else{
                    calculatorShowPanel.getTextPane().setText(calculatorShowPanel.getTextPane().getText() + "5");
                }
            }else if (e.getActionCommand().equals("6")) {
                if(calculatorShowPanel.getTextPane().getText().equals("0")){
                    calculatorShowPanel.getTextPane().setText("6");
                }else{
                    calculatorShowPanel.getTextPane().setText(calculatorShowPanel.getTextPane().getText() + "6");
                }
            }else if (e.getActionCommand().equals("7")) {
                if(calculatorShowPanel.getTextPane().getText().equals("0")){
                    calculatorShowPanel.getTextPane().setText("7");
                }else{
                    calculatorShowPanel.getTextPane().setText(calculatorShowPanel.getTextPane().getText() + "7");
                }
            }else if (e.getActionCommand().equals("8")) {
                if(calculatorShowPanel.getTextPane().getText().equals("0")){
                    calculatorShowPanel.getTextPane().setText("8");
                }else{
                    calculatorShowPanel.getTextPane().setText(calculatorShowPanel.getTextPane().getText() + "8");
                }
            }else if (e.getActionCommand().equals("9")) {
                if(calculatorShowPanel.getTextPane().getText().equals("0")){
                    calculatorShowPanel.getTextPane().setText("9");
                }else{
                    calculatorShowPanel.getTextPane().setText(calculatorShowPanel.getTextPane().getText() + "9");
                }
            }else if (e.getActionCommand().equals("C")) {
                calculatorShowPanel.getTextPane().setText("0");
            }else if (e.getActionCommand().equals("+")) {
                calculatorShowPanel.getTextPane().setText(calculatorShowPanel.getTextPane().getText() + "+");
            }else if (e.getActionCommand().equals("-")) {
                calculatorShowPanel.getTextPane().setText(calculatorShowPanel.getTextPane().getText() + "-");
            }else if (e.getActionCommand().equals("/")) {
                calculatorShowPanel.getTextPane().setText(calculatorShowPanel.getTextPane().getText() + "/");
            }else if (e.getActionCommand().equals("X")) {
                calculatorShowPanel.getTextPane().setText(calculatorShowPanel.getTextPane().getText() + "X");
            }else if (e.getActionCommand().equals("=")) {
                calculatorShowPanel.getTextPane().setText("0");
            }
        };

        this.calculatorShowPanel = new CalculatorShowPanel();
        this.calculatorButtonPanel = new CalculatorButtonPanel(actionListener);

        this.calculatorShowPanel.setBounds(0,5,333,50);
        this.calculatorButtonPanel.setBounds(0,60, 333, 400);

        this.add(this.calculatorShowPanel);
        this.add(this.calculatorButtonPanel);
    }

    public void initialize() {
        this.calculatorShowPanel.initialize();
        this.calculatorButtonPanel.initialize();
    }
}
