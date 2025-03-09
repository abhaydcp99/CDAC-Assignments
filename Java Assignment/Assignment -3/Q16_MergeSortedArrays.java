import java.util.*;

public class Q16_MergeSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read sizes of both arrays
        int p = scanner.nextInt();
        int q = scanner.nextInt();

        // Read first sorted array (A)
        int[] A = new int[p];
        for (int i = 0; i < p; i++) {
            A[i] = scanner.nextInt();
        }

        // Read second sorted array (B)
        int[] B = new int[q];
        for (int i = 0; i < q; i++) {
            B[i] = scanner.nextInt();
        }

        scanner.close();

        // Merge A and B while maintaining sorted order
        int[] merged = new int[p + q];
        int i = 0, j = 0, k = 0;

        while (i < p && j < q) {
            if (A[i] < B[j]) {
                merged[k++] = A[i++];
            } else {
                merged[k++] = B[j++];
            }
        }

        // Copy remaining elements from A (if any)
        while (i < p) {
            merged[k++] = A[i++];
        }

        // Copy remaining elements from B (if any)
        while (j < q) {
            merged[k++] = B[j++];
        }

        // Update A and B
        for (i = 0; i < p; i++) {
            A[i] = merged[i];
        }
        for (j = 0; j < q; j++) {
            B[j] = merged[p + j];
        }

        // Print the sorted arrays
        System.out.println("Sorted A: " + Arrays.toString(A));
        System.out.println("Sorted B: " + Arrays.toString(B));
    }
}
