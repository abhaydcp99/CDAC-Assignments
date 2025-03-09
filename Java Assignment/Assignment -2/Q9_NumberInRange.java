import java.util.Scanner;

/*
Q9: Implement a Java program that checks if a number is within 
    a specific range (20 to 50) without using if-else. 
    Hint: Use logical AND (&&) in a print statement.
*/

public class Q9_NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Is number in range (20 to 50): " + (num >= 20 && num <= 50));
        scanner.close();
    }
}
