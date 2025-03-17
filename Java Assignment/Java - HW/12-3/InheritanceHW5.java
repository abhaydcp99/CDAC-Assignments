// Case 5: Parent and Child Both Have Default and Parameterized Constructors 

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
        System.out.println("Child Parameterized : P");
    }
}

public class InheritanceHW5 {
    public static void main(String[] args) {
        Child c = new Child("Mahesh");
    }
}

/*No compile-time or execution error.
Reason: The Parent class has a default constructor, so when we create a Child object, the default parent constructor executes first. */
