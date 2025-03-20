import java.util.*;

class QueueDemo {
    public static void main(String[] args) {
        Queue<String> callQueue = new LinkedList<>();
        callQueue.add("Customer A");
        callQueue.add("Customer B");
        callQueue.add("Customer C");

        System.out.println("Next call: " + callQueue.poll()); // Removes first element
        System.out.println("Remaining Queue: " + callQueue);
    }
}


/*4. Queue Interface (FIFO - First In, First Out)
A Queue follows the FIFO principle, meaning elements are processed in the order they arrive.

Implementations:
LinkedList → Can function as both List and Queue.
PriorityQueue → Orders elements based on priority.
💡 Real-Life Example:
A customer service call center, where calls are answered in the order they arrive.



🛠 Use Case: When processing tasks in order of arrival.

*/