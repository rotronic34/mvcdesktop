package roc.com.company;

import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame
{
    private JTextField firstNumber = new JTextField(10);
    private JLabel plusSign = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calculatorSolution = new JTextField(10);

    CalculatorView(){
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(600,200);
        calcPanel.add(firstNumber);
        calcPanel.add(plusSign);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calculatorSolution);

        this.add(calcPanel);
    }

    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }
    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }
    public int getCalcSolution(){
        return Integer.parseInt(calculatorSolution.getText());
    }

    public void setCalculatorSolution(int solution){
        calculatorSolution.setText(Integer.toString(solution));
    }

    void addCalculationListener(ActionListener listenForCalcButton){
        calculateButton.addActionListener(listenForCalcButton);
    }

    void displayErrorForMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
