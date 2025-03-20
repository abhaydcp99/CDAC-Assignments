interface Hello {
    void sayHello(); // Interface method (to be implemented by anonymous class)
}

interface Helloworld {
    void msg(); // Interface method (to be implemented by anonymous class)
}

// ERROR: Abstract class must be defined using 'class' keyword, not directly as 'abstract'
abstract class Morning {
    abstract void manage(); // Abstract method (must be implemented in a subclass)
}

public class AnonymousClassDemo {
    public static void main(String[] args) {
        // Creating an anonymous class that implements Hello interface
        Hello h1 = new Hello() {
            public void sayHello() {
                System.out.println("Hello world!"); // Implementation of sayHello()
            }
        };
        
        //--------------------------------------------------
        // Creating an anonymous class that implements Helloworld interface
        Helloworld h2 = new Helloworld() {
            public void msg() {
                System.out.println("Testing"); // Implementation of msg()
            }
        };
        
        // Calling the methods of the anonymous classes
        h1.sayHello(); // Outputs: Hello world!
        h2.msg();      // Outputs: Testing
    }
}
