import java.util.Scanner;

/*
Q25: Implement a program that reverses an integer number
     without using string conversion (StringBuilder or toCharArray).
     Hint: Use while(n!=0) { rev = rev * 10 + n % 10; n /= 10; }
*/

public class Q25_ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Reversed number: " + rev);
        scanner.close();
    }
}
