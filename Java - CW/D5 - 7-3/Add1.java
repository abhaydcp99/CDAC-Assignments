import java.util.Scanner;

class Add1 {
    int[][] arr1 = new int[3][3];
    int[][] arr2 = new int[3][3];

    Scanner sc = new Scanner(System.in);

    // Constructor to initialize and add matrices
    Add() {
        // Input for arr1
        System.out.println("Enter values for Matrix 1:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                arr1[i][j] = sc.nextInt();
            }
        }

        // Input for arr2
        System.out.println("Enter values for Matrix 2:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                arr2[i][j] = sc.nextInt();
            }
        }

        // Matrix addition
        int[][] res = new int[3][3];

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // Print result
        System.out.println("Addition of Two Matrices:");
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println(); // Newline after each row
        }
    }
}

class MatrixAdd {
    public static void main(String[] args) {
        new Add(); // Calls the constructor, which performs the operations
    }
}
