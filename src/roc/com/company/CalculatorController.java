package roc.com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel){

        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener(new CalculationListener());

    }

    class CalculationListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;

            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalculatorSolution(theModel.getCalculatorValue());
            }
            catch (NumberFormatException ex){
                theView.displayErrorForMessage("You need to enter 2 integers ");
            }
        }
    }
}
