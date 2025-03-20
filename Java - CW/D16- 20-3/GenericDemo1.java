public class GenericDemo1<T> {
    T x; // Generic type variable
    
    // Constructor to initialize the generic variable
    GenericDemo1(T x) {
        this.x = x;
    }
    
    // Method to return the stored value
    public T show() {
        return this.x;
    }

    public static void main(String[] args) {
        // Creating objects of GenericDemo1 with different data types
        GenericDemo1<Integer> g1 = new GenericDemo1<>(15); // Integer type
        GenericDemo1<Double> g2 = new GenericDemo1<>(15.45657587); // Double type
        GenericDemo1<String> g3 = new GenericDemo1<>("Generics"); // String type
        
        // Printing the stored values
        System.out.println(g1.show()); // Output: 15
        System.out.println(g2.show()); // Output: 15.45657587
        System.out.println(g3.show()); // Output: Generics
    }
}
