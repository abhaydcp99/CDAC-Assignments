class Q2_ReassigningReference {
    public static void main(String[] args) {
        String str = new String("Java"); // First object
        str = new String("Python"); // "Java" object is now eligible for GC

        System.gc();
        System.out.println("Garbage Collection Requested");
    }
}
