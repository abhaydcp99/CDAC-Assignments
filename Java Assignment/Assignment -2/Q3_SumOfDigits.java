// Q3: Implement a program that calculates the sum of digits of an integer using modulus (%) and division (/) operators. 


import java.util.Scanner;

public class Q3_SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int sum = 0;
        
        num = Math.abs(num); // Handle negative numbers

        while (num > 0) {
            sum += num % 10; // Get last digit
            num /= 10;       // Remove last digit
        }

        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}
