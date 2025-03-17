// Case 2: Default Constructor for Parent & Parameterized Constructor for Child 

class Parent {
    Parent() {
        System.out.println("Default constructor : P");
    }
}

class Child extends Parent {
    Child(String name) {
        System.out.println("Child Parameterized : C");
    }
}

public class InheritanceHW2 {
    public static void main(String[] args) {
        Child c = new Child("Mahesh");
    }
}

/*
No compile-time or execution error.
Reason: Parent constructor executes first, followed by the child’s parameterized constructor.

 */