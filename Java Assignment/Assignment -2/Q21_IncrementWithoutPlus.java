import java.util.Scanner;

/*
Q21: Write a program that increments a number without using + or ++ operators.
Hint: Use bitwise - (~x).
*/

public class Q21_IncrementWithoutPlus {
    public static int increment(int num) {
        return -~num; // Bitwise negation trick to add 1
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Incremented value: " + increment(num));
        scanner.close();
    }
}
