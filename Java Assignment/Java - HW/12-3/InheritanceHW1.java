// Case 1: Default Constructor for Parent and Child 

class Parent {
    Parent() {
        System.out.println("Default constructor : P");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Default constructor : C");
    }
}

public class InheritanceHW1 {
    public static void main(String[] args) {
        Child c = new Child();
    }
}



// No error – Both parent and child constructors execute normally.
// Reason: Parent constructor runs first, followed by the child.

