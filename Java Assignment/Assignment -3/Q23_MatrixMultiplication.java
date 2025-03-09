import java.util.*;

public class Q23_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read dimensions of first matrix (A)
        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();
        int[][] A = new int[m1][n1];

        // Read elements of first matrix (A)
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Read dimensions of second matrix (B)
        int m2 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int[][] B = new int[m2][n2];

        // Read elements of second matrix (B)
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        // Check if matrix multiplication is possible
        if (n1 != m2) {
            System.out.println("Matrix multiplication not possible.");
            return;
        }

        // Resultant matrix (C) will have dimensions (m1 x n2)
        int[][] C = new int[m1][n2];

        // Matrix multiplication logic
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print the resultant matrix
        System.out.println("Product of Matrices:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
