package calculator;
import java.util.Scanner;

public class CalcTest {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        calc.check();
        System.out.println(calc.check());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 2 liczby");
        int firstNumber = scanner.nextInt();
        System.out.println("A teraz druga");
        int secondNumber = scanner.nextInt();
        System.out.println("Wynik to: " + calc.check());
    }
}
