package calculator;
public class Calculator {

    public void check(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println(firstNumber * secondNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println(firstNumber*firstNumber);
        }
    }
}












