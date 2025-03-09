import java.util.*;

public class Q5_SumAndAverage {
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

        // Initialize sum variable
        int sum = 0;

        // Calculate sum of elements
        for (int num : arr) {
            sum += num;
        }

        // Calculate average
        double average = (double) sum / n;

        // Print results
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
    }
}
