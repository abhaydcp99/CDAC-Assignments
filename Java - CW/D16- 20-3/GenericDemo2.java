public class GenericDemo2<T> {
    T x;
    T y;
    
    // Constructor accepting two generic type parameters
    GenericDemo2(T x, T y) {
        this.x = x;
        this.y = y;
    }
    
    // Method to return the first stored value
    public T show() {
        return this.x;
    }

    public static void main(String[] args) {
        // Creating objects with two arguments
        GenericDemo2<Integer> g1 = new GenericDemo2<>(15, 30);
        GenericDemo2<Double> g2 = new GenericDemo2<>(15.45657587, 20.12345);
        GenericDemo2<String> g3 = new GenericDemo2<>("Generics", "Example");
        
        // Printing the stored values
        System.out.println(g1.show()); // Output: 15
        System.out.println(g2.show()); // Output: 15.45657587
        System.out.println(g3.show()); // Output: Generics
    }
}
