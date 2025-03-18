class Q6_IslandOfIsolation {
    Q6_IslandOfIsolation obj;

    public static void main(String[] args) {
        Q6_IslandOfIsolation obj1 = new Q6_IslandOfIsolation();
        Q6_IslandOfIsolation obj2 = new Q6_IslandOfIsolation();

        obj1.obj = obj2; // obj1 refers to obj2
        obj2.obj = obj1; // obj2 refers to obj1

        obj1 = null;
        obj2 = null; // Now both objects form an "island of isolation"

        System.gc();
        System.out.println("Garbage Collection Requested");
    }
}
