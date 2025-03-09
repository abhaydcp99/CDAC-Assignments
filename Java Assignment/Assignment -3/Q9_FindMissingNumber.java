import java.util.*;

public class Q9_FindMissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of the array (should be n-1)
        int n = scanner.nextInt();
        int[] arr = new int[n - 1];

        // Read array elements
        int actualSum = 0;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
            actualSum += arr[i]; // Compute the sum of given elements
        }

        scanner.close();

        // Compute the expected sum of 1 to n
        int expectedSum = (n * (n + 1)) / 2;

        // Find the missing number
        int missingNumber = expectedSum - actualSum;

        // Print result
        System.out.println("Missing Number: " + missingNumber);
    }
}
