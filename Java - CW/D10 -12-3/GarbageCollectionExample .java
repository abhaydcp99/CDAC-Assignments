class GarbageCollectionExample {
    public static void main(String[] args) {
        String room1 = new String("Guest 1"); // Guest checks in
        String room2 = new String("Guest 2"); // Another guest checks in

        room1 = null; // Guest 1 checks out (room becomes empty)
        room2 = null; // Guest 2 checks out

        System.gc(); // Requesting garbage collection
        System.out.println("Garbage Collection Requested");
    }
}


/*Real-Life Example : ----------------

Think of Java’s garbage collection like a cleaning service in a hotel:

Creating Objects → Guests Checking into Rooms

When you create objects in Java using new, it's like guests checking into a hotel and occupying rooms.
Objects No Longer Used → Guests Checking Out

When an object is no longer referenced (no one is using it), it's like guests checking out of the hotel.
Garbage Collector → Hotel Cleaning Staff

The garbage collector acts like hotel cleaning staff who clean the vacated rooms (unused objects) so they can be used again. */










/*Key Points:
room1 and room2 are no longer needed, so Java’s garbage collector will remove them.
The System.gc() method requests garbage collection, but it does not guarantee immediate cleanup.
Java automatically runs garbage collection in the background when needed. */