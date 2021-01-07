package main;

import logic.CalculatorLogic;
import view.CalculatorFrame;

public class Main {

    public static void main(String[] args) {
        CalculatorLogic calculatorLogic = new CalculatorLogic();
        CalculatorFrame calculatorFrame = new CalculatorFrame(calculatorLogic);
        calculatorFrame.setVisible(true);
        calculatorFrame.initialize();
    }
}
