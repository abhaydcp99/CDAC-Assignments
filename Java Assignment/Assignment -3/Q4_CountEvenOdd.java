import java.util.*;

public class Q4_CountEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // Initialize counters
        int evenCount = 0;
        int oddCount = 0;

        // Count even and odd numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print results
        System.out.println("Even Numbers: " + evenCount);
        System.out.println("Odd Numbers: " + oddCount);
    }
}
