// Case 4: Default Constructors for Parent & Child, Parameterized Child 

class Parent {
    Parent() {
        System.out.println("Default constructor : P");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Default constructor : C");
    }
    Child(String name) {
        System.out.println("Child Parameterized : C");
    }
}

public class InheritanceHW4 {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

/*No compile-time or execution error.
Reason: The default constructor in Parent is correctly invoked before Child(). */