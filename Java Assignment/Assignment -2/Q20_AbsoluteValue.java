import java.util.Scanner;

/*
Q20: Implement a Java program that returns the absolute value of a given number using the ternary operator (without using Math.abs()).
*/

public class Q20_AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int abs = (num < 0) ? -num : num;

        System.out.println("Absolute value: " + abs);
        scanner.close();
    }
}
