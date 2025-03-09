import java.util.*;

public class Q11_SubarrayWithSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read array size
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Read target sum
        int S = scanner.nextInt();
        scanner.close();

        // Find subarray with the given sum
        int start = 0, currentSum = 0;

        for (int end = 0; end < n; end++) {
            currentSum += arr[end];

            // Shrink window if sum exceeds S
            while (currentSum > S && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            // Check if subarray found
            if (currentSum == S) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }

        // No subarray found
        System.out.println("No subarray found");
    }
}
