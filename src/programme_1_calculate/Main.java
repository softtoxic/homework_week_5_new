package programme_1_calculate;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Jay Vaghani
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please enter first number : ");
            int a = scanner.nextInt();
            System.out.println("Please enter second number : ");
            int b = scanner.nextInt();
            System.out.println("Please enter one of symbol +, -, *, / :");
            char symbol = scanner.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation please enter 'Y' or 'N' : ");
            answer = scanner.next().toLowerCase(Locale.ROOT);
        }while (answer.startsWith("y"));
        scanner.close();
    }
}
