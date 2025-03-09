import java.util.Scanner;

/*
Q12: Write a Java program to multiply a number by 8 without using * or / operators.
Hint: Use bitwise left shift (<<).
*/

public class Q12_MultiplyBy8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int result = num << 3; // Multiply by 8 using left shift

        System.out.println(num + " multiplied by 8 is: " + result);
        scanner.close();
    }
}
