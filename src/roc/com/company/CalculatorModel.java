package roc.com.company;

public class CalculatorModel {

    private int calculatorValue;

    public void addTwoNumbers(int firstNumber, int secondNumber) {
        calculatorValue = firstNumber + secondNumber;
    }

    public int getCalculatorValue() {
        return calculatorValue;
    } 
}
