package calculator;


class Calculator {
//
    int firstNumber ;
    int secondNumber;

     public int check() {

        if (firstNumber > secondNumber) {
           return  firstNumber + secondNumber;
        } else if (firstNumber < secondNumber){
           return firstNumber * secondNumber;
        } else  {
           return firstNumber * firstNumber;
        }
    }
}












