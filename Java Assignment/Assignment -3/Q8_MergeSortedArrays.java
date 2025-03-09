import java.util.*;

public class Q8_MergeSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read sizes of both arrays
        int p = scanner.nextInt();
        int q = scanner.nextInt();

        // Read first sorted array (A)
        int[] A = new int[p + q]; // A has extra space to accommodate B
        for (int i = 0; i < p; i++) {
            A[i] = scanner.nextInt();
        }

        // Read second sorted array (B)
        int[] B = new int[q];
        for (int i = 0; i < q; i++) {
            B[i] = scanner.nextInt();
        }

        scanner.close();

        // Merge arrays in-place
        int i = p - 1; // Last element of A's actual data
        int j = q - 1; // Last element of B
        int k = p + q - 1; // Last index of the merged array

        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
        }

        // Copy remaining elements of B (if any)
        while (j >= 0) {
            A[k--] = B[j--];
        }

        // Print the merged array
        System.out.print("Merged Sorted Array: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
