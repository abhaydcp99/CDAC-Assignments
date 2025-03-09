import java.util.*;

public class Q10_UnionIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first array size and elements
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Read second array size and elements
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }

        scanner.close();

        // Find Union using HashSet
        Set<Integer> unionSet = new HashSet<>();
        for (int num : arr1) unionSet.add(num);
        for (int num : arr2) unionSet.add(num);

        // Find Intersection using HashSet
        Set<Integer> intersectionSet = new HashSet<>();
        Set<Integer> tempSet = new HashSet<>();
        for (int num : arr1) tempSet.add(num);
        for (int num : arr2) {
            if (tempSet.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Print Union
        System.out.print("Union: ");
        for (int num : unionSet) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print Intersection
        System.out.print("Intersection: ");
        for (int num : intersectionSet) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
