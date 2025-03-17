//Case 6: Explicitly Calling Parent & Child Parameterized Constructors 

class Parent {
    Parent() {
        System.out.println("Default constructor : P");
    }
    Parent(String name) {
        System.out.println("Parameterized constructor : P");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Default constructor : C");
    }
    Child(String name) {
        super(name); // Explicitly calling Parent parameterized constructor
        System.out.println("Child Parameterized : C, P");
    }
}

public class InheritanceHW6 {
    public static void main(String[] args) {
        Child c = new Child("Mahesh");
    }
}

/*No compile-time or execution error.
Reason: super(name); explicitly calls the Parent's parameterized constructor before executing Child().
 */