import java.util.Scanner;

/*
Q14: Write a program to count the number of 1s (set bits) in a binary representation of a number using bitwise operations.
Hint: Use n & (n - 1).
*/

public class Q14_CountSetBits {
    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            num &= (num - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Number of set bits: " + countSetBits(num));
        scanner.close();
    }
}
