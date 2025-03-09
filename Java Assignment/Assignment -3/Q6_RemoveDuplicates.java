import java.util.*;

public class Q6_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read sorted array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // Edge case: If the array has 0 or 1 elements, return it as is
        if (n == 0) {
            System.out.println("Empty Array");
            return;
        }
        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }

        // Remove duplicates in-place
        int index = 0; // Pointer for unique elements
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[index]) {
                index++;
                arr[index] = arr[i]; // Move unique element forward
            }
        }

        // Print unique elements
        for (int i = 0; i <= index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
