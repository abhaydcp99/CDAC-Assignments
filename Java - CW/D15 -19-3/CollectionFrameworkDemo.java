import java.util.*;

class CollectionFrameworkDemo {
    public static void main(String[] args) {
        // 1. List Example (Stores ordered customer names)
        List<String> customerList = new ArrayList<>();
        customerList.add("Alice");
        customerList.add("Bob");
        customerList.add("Charlie");
        customerList.add("Alice"); // Duplicates allowed
        System.out.println("Customer List: " + customerList);

        // 2. Set Example (Stores unique product IDs)
        Set<String> productIDs = new HashSet<>();
        productIDs.add("P101");
        productIDs.add("P102");
        productIDs.add("P101"); // Duplicate ignored
        System.out.println("Product IDs: " + productIDs);

        // 3. Queue Example (Billing Counter, FIFO Order)
        Queue<String> billingQueue = new LinkedList<>();
        billingQueue.add("Alice");
        billingQueue.add("Bob");
        billingQueue.add("Charlie");
        System.out.println("First customer served: " + billingQueue.poll()); // Removes Alice

        // 4. Map Example (Product Name and Price)
        Map<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Apple", 100);
        productPrices.put("Banana", 50);
        productPrices.put("Orange", 80);
        System.out.println("Price of Apple: " + productPrices.get("Apple"));
    }
}


/*
Customer List: [Alice, Bob, Charlie, Alice]
Product IDs: [P102, P101]
First customer served: Alice
Price of Apple: 100
 */