import java.util.*;

public class Q2_ReverseArray {
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

        // Reverse the array in place using two-pointer method
        int start = 0, end = n - 1;
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the pointers
            start++;
            end--;
        }

        // Print the reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
