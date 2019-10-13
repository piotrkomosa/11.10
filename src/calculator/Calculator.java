package calculator;
public class Calculator {

    public int check(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber + secondNumber;
        } else if (firstNumber < secondNumber) {
            return firstNumber * secondNumber;
        } else  (firstNumber <  secondNumber) {
            return firstNumber * firstNumber;
        }
    }
}












