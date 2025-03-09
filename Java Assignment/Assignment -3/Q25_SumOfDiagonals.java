import java.util.*;

public class Q25_SumOfDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read matrix size (square matrix)
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        // Read matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        // Calculate diagonal sums
        int primarySum = 0, secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];  // Primary diagonal
            secondarySum += matrix[i][n - 1 - i];  // Secondary diagonal
        }

        // If n is odd, subtract the middle element (it was counted twice)
        if (n % 2 == 1) {
            int center = matrix[n / 2][n / 2];
            secondarySum -= center;
        }

        // Compute total diagonal sum
        int totalSum = primarySum + secondarySum;

        // Print result
        System.out.println("Sum of Both Diagonals: " + totalSum);
    }
}
