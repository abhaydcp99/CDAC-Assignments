import java.util.*;

public class Q15_SubarraysWithZeroSum {
    public static void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        // Add initial sum (zero) to handle cases where sum becomes zero at some index
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum exists in the map, we found a zero-sum subarray
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    System.out.println("Subarray with 0 sum: " + Arrays.toString(Arrays.copyOfRange(arr, start + 1, i + 1)));
                }
            }

            // Store index in the map for future reference
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read array size
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // Find and print all zero-sum subarrays
        findZeroSumSubarrays(arr);
    }
}
