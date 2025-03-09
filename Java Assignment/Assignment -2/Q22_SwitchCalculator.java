import java.util.Scanner;

/*
Q22: Implement a calculator that takes two numbers and an operator (+, -, *, /) as input
     and prints the result using only switch-case.
*/

public class Q22_SwitchCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num2 != 0 ? num1 / num2 : Double.NaN; break;
            default: System.out.println("Invalid operator!");
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
