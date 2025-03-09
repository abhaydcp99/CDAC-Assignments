import java.util.Scanner;

/*
Q5: Write a Java program to swap two numbers using the 
    += and -= operators only.
*/

public class Q5_SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a += b; // a = a + b
        b = a - b; // b = (a + b) - b = a
        a -= b; // a = (a + b) - a = b

        System.out.println("After swapping: a = " + a + ", b = " + b);
        scanner.close();
    }
}
