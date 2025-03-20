import java.util.*;

class SetDemo {
    public static void main(String[] args) {
        Set<String> voterIDs = new HashSet<>();
        voterIDs.add("VOTER123");
        voterIDs.add("VOTER456");
        voterIDs.add("VOTER123"); // Duplicate ignored
        System.out.println("Voter IDs: " + voterIDs);
    }
}


/*3. Set Interface (No Duplicates, Unordered)
A Set does not allow duplicate values and may not maintain insertion order.

Implementations:
HashSet → Fastest, unordered.
LinkedHashSet → Maintains insertion order.
TreeSet → Sorted in ascending order.
💡 Real-Life Example:
A voter registration system, where each citizen should have only one voter ID.

🛠 Use Case: When unique elements are needed.


*/