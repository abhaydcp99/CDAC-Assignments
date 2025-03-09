import java.util.Scanner;

/*
Q6: Write a program to find the largest of three numbers 
    using only the ternary operator (? :).
*/

public class Q6_LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("The largest number is: " + largest);
        scanner.close();
    }
}
