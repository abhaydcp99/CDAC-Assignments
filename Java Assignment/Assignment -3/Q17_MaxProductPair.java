import java.util.*;

public class Q17_MaxProductPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read array size
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // Edge case: If array has less than 2 elements, no pairs exist
        if (n < 2) {
            System.out.println("No valid pair exists.");
            return;
        }

        // Initialize variables to find the two largest and two smallest numbers
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        // Find max1, max2 and min1, min2 in one pass
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // Calculate product of two largest and two smallest numbers
        int product1 = max1 * max2;
        int product2 = min1 * min2;

        // Find the maximum product
        if (product1 > product2) {
            System.out.println("Pair is (" + max1 + ", " + max2 + "), Maximum Product: " + product1);
        } else {
            System.out.println("Pair is (" + min1 + ", " + min2 + "), Maximum Product: " + product2);
        }
    }
}
