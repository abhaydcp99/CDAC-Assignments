import java.util.Scanner;

public class Q4_DivisibilityBy3 {
    public static boolean isDivisibleBy3(int num) {
        num = Math.abs(num); // Handle negative numbers
        
        while (num > 0) {
            int sum = 0;
            while (num > 0) {
                sum += num & 1; // Add last bit
                num >>= 1;      // Right shift (divide by 2)
            }
            num = sum; // Repeat with sum until we get a single digit
        }

        return num == 0 || num == 3 || num == 6 || num == 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (isDivisibleBy3(num)) {
            System.out.println(num + " is divisible by 3.");
        } else {
            System.out.println(num + " is not divisible by 3.");
        }
        
        scanner.close();
    }
}
