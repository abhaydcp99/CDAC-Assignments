import java.util.*;

class ListDemo {
    public static void main(String[] args) {
        List<String> playlist = new ArrayList<>();
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song A"); // Duplicates allowed
        System.out.println("Playlist: " + playlist);
    }
}


/*2. List Interface (Ordered, Allows Duplicates)
A List maintains the insertion order and allows duplicate elements.

Implementations:
ArrayList → Fast for retrieval, slow for insertions/deletions.
LinkedList → Fast for insertions/deletions, slow for retrieval.
Vector → Like ArrayList but thread-safe.
💡 Real-Life Example:
A playlist in a music app where songs are stored in order and can be repeated.

🛠 Use Case: When maintaining the order of elements is important.


 */