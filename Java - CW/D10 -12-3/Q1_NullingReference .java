class Q1_NullingReference {
    public static void main(String[] args) {
        String str = new String("Hello, World!"); // Object created
        str = null; // Now "Hello, World!" object is eligible for GC

        System.gc(); // Requesting Garbage Collection
        System.out.println("Garbage Collection Requested");
    }
}
