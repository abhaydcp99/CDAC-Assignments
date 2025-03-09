import java.util.Scanner;

/*
Q15: Implement a program to swap odd and even bits of a number using bitwise operators.
Hint: Use masks: (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1.
*/

public class Q15_SwapOddEvenBits {
    public static int swapBits(int x) {
        return ((x & 0xAAAAAAAA) >> 1) | ((x & 0x55555555) << 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Number after swapping odd and even bits: " + swapBits(num));
        scanner.close();
    }
}
