import java.util.*;

public class Q14_SeparateEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define array size (fixed to 20)
        int n = 20;
        int[] arr = new int[n];

        // Read 20 integers
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // Lists to store even and odd numbers
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        // Separate even and odd numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }

        // Print even numbers
        System.out.print("Even Numbers: ");
        for (int num : evenList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print odd numbers
        System.out.print("Odd Numbers: ");
        for (int num : oddList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
