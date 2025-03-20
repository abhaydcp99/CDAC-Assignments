
import java.util.*;

class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> priceList = new HashMap<>();
        priceList.put("Apple", 100);
        priceList.put("Banana", 50);
        priceList.put("Orange", 80);

        System.out.println("Price of Apple: " + priceList.get("Apple"));
    }
}




/*5. Map Interface (Key-Value Storage, Not a Collection)
A Map stores key-value pairs and allows fast lookups based on keys.

Implementations:
HashMap → Fast, unordered.
LinkedHashMap → Maintains insertion order.
TreeMap → Sorted by keys.
Hashtable → Synchronized (thread-safe).
💡 Real-Life Example:
A product price list, where the product name is the key and its price is the value.



🛠 Use Case: When storing key-value pairs for quick retrieval.
*/
