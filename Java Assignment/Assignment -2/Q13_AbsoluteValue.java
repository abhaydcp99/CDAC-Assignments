import java.util.Scanner;

/*
Q13: Implement a Java program to find the absolute value of an integer using bitwise operators.
Hint: mask = num >> 31; abs = (num + mask) ^ mask;
*/

public class Q13_AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int mask = num >> 31;
        int abs = (num + mask) ^ mask;

        System.out.println("Absolute value of " + num + " is: " + abs);
        scanner.close();
    }
}
