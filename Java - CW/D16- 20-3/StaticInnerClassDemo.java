class Oclass {
    static int x = 100; // Static variable of Outer class
    int a = 500; // Instance variable of Outer class

    // Static method in Outer class
    static void display() {
        System.out.println("Static method : M1");
        System.out.println(x); // Accessing static variable
        System.out.println(Iclass.y); // Accessing static member of Inner class
        // System.out.println(a); // Error: Cannot access non-static variable
    }

    // Static inner class
    static class Iclass {
        static int y = 200; // Static variable of Inner class

        // Static method in Inner class
        static void display1() {
            System.out.println("Static method : M2");
            System.out.println(x); // Accessing Outer class static variable
            System.out.println(y); // Accessing Inner class static variable
            // System.out.println(a); // Error: Cannot access non-static variable
        }
    }
}

public class StaticInnerClassDemo {
    public static void main(String[] args) {
        Oclass o1 = new Oclass(); // Creating an instance of Outer class
        System.out.println(o1.x); // Accessing static variable (Allowed but should be Oclass.x)
        
        // Calling static method of Outer class
        Oclass.display();
        
        // Calling static method of Inner class directly without creating an object
        Oclass.Iclass.display1();
        
        o1.display(); // Calling Outer class static method (Allowed but should be Oclass.display())
        
        // Creating an instance of Static Inner class
        Oclass.Iclass o2 = new Oclass.Iclass();
        System.out.println(o2.y); // Accessing static variable of Inner class
    }
}
