import java.util.*;

public class Q7_RotateArray {
    // Function to reverse part of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read array size
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Read k (rotation count)
        int k = scanner.nextInt();
        scanner.close();

        // Handle edge cases
        if (n == 0 || k == 0) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            return;
        }

        // Normalize k to avoid unnecessary rotations
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);
        // Step 3: Reverse the remaining elements
        reverse(arr, k, n - 1);

        // Print the rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
