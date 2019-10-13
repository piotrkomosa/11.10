package calculator;
import java.util.Scanner;

public class CalcTest {

    public static void main(String[] args) {

        int firstNumber ;
        int secondNumber;
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        calc.check();
        System.out.println("podaj pierwsza liczbe X: ");
        scanner.nextLine();
        System.out.println("podaj druga liczbe Y: ");
        scanner.nextLine();
        scanner.close();
        System.out.println("wynik to: " + calc.check());
    }
}