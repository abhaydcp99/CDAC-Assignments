public class GenericDemo {
    
    // Generic method to display the type and value of the argument
    static <T> void display(T x) {
        System.out.println(x.getClass().getName() + " " + x); // Prints class name and value
    }

    public static void main(String[] args) {
        
        // Calling the generic method with different data types
        display(11);             // Integer input
        display(11.4556767);     // Double input
        display("Generics is too easy!"); // String input
    }
}
