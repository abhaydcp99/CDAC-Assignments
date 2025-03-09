import java.util.*;

public class Q22_MaxElementInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read matrix dimensions
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];

        // Read matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        // Find the maximum element
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }

        // Print the maximum element
        System.out.println("Maximum Element in Matrix: " + maxElement);
    }
}
