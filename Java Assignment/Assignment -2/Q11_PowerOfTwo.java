import java.util.Scanner;

/*
Q11: Write a program to check if a given number is a power of 2 using bitwise operators.
Hint: n & (n - 1) == 0 for positive numbers.
*/

public class Q11_PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println(num + (isPowerOfTwo(num) ? " is a power of 2." : " is not a power of 2."));
        scanner.close();
    }
}
