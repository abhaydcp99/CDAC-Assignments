import java.util.*;

public class Q20_SumOfMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read matrix dimensions
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[m][n];

        // Read first matrix
        System.out.println("Enter first matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Read second matrix
        System.out.println("Enter second matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        // Compute sum of matrices
        int[][] sumMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the resultant matrix
        System.out.println("Sum of Matrices:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
