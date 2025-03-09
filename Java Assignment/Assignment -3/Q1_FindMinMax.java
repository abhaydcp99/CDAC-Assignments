//1.  Find the Largest and Smallest Element 
// -----  Given an array, find the smallest and largest elements in it. 
 
 
 import java.util.*;

public class Q1_FindMinMax {
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

        // Initialize min and max with the first element
        int min = arr[0];
        int max = arr[0];

        // Loop through the array to find min and max
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print the results
        System.out.println("Smallest Element: " + min);
        System.out.println("Largest Element: " + max);
    }
}
