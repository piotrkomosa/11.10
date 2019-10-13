package calculator;

import java.util.Scanner;

class Calculator {

    int firstNumber;
    int secondNumber;

    public Calculator() {
    }

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public int getFirstNumber() {
        return firstNumber;
    }
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }
    public int getSecondNumber() {
        return secondNumber;
    }
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

     public int check() {
        if (firstNumber > secondNumber) {
           return  firstNumber + secondNumber;
        } else if (firstNumber < secondNumber){
           return firstNumber * secondNumber;
        } else (firstNumber == secondNumber){
           return firstNumber * firstNumber;
        }
    }
}












