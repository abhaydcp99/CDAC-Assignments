import java.util.*;

public class Q12_CountEvenOddMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define array size (fixed to 20)
        int n = 20;
        int[] arr = new int[n];

        // Read 20 integers
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // Initialize counters
        int evenCount = 0, oddCount = 0, multipleOf3Count = 0;

        // Count even, odd, and multiples of 3
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            if (num % 3 == 0) {
                multipleOf3Count++;
            }
        }

        // Print results
        System.out.println("Number of Even Numbers: " + evenCount);
        System.out.println("Number of Odd Numbers: " + oddCount);
        System.out.println("Number of Multiples of 3: " + multipleOf3Count);
    }
}
