import java.util.*;

public class Q21_RowColumnSum {
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

        // Compute row-wise sum
        System.out.println("Row-Wise Sum:");
        for (int i = 0; i < m; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + " Sum: " + rowSum);
        }

        // Compute column-wise sum
        System.out.println("Column-Wise Sum:");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < m; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + " Sum: " + colSum);
        }
    }
}
