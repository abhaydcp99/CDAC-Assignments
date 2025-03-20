class OuterClass {
    int x = 100; // Instance variable of OuterClass

    // Method of OuterClass
    public void display() {
        System.out.println("Outer class : Method");
        // System.out.println(y); // Compilation Error: Outer class cannot access Inner class members directly
    }

    // Inner class inside OuterClass
    class InnerClass {
        int y = 200; // Instance variable of InnerClass

        // Method of InnerClass
        public void display1() {
            System.out.println("Inner class : Method");
            System.out.println(x); // Accessing OuterClass variable (allowed)
            display(); // Calling OuterClass method
        }
    }
}

public class InnerClassDemo1 {
    public static void main(String[] args) {
        // Creating an instance of OuterClass
        OuterClass o1 = new OuterClass(); // Reference to Outer class
        System.out.println(o1.x); // Accessing OuterClass variable (100)
        o1.display(); // Calling OuterClass method

        // Creating an instance of InnerClass using OuterClass instance
        OuterClass.InnerClass o2 = o1.new InnerClass(); // Reference to Inner class
        System.out.println(o2.y); // Accessing InnerClass variable (200)
        o2.display1(); // Calling InnerClass method
    }
}