import java.util.*;

public class Q19_TransposeMatrix {
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

        // Create transpose matrix (size n x m)
        int[][] transpose = new int[n][m];

        // Compute the transpose
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
