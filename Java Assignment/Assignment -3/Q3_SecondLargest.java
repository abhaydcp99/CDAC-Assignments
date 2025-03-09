import java.util.*;

public class Q3_SecondLargest {
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

        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        // Initialize largest and second-largest variables
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find the second largest element
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // If secondLargest is not updated, it means there's no second distinct largest element
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest Element: " + secondLargest);
        }
    }
}
