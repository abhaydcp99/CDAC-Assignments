import java.util.Scanner;

/*
Q16: Write a program that determines whether a given number is positive, negative, or zero using only the ternary operator.
*/

public class Q16_PosNegZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        System.out.println("The number is: " + result);
        scanner.close();
    }
}
