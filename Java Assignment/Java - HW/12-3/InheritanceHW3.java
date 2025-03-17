//Case 3: Default Constructor for Child & Parameterized Constructor for Parent 

class Parent {
    Parent(String name) { // Parameterized constructor
        System.out.println("Default constructor : C");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Parameterized : P");
    }
}

public class InheritanceHW3 {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

/*Compile-Time Error: "Constructor Parent in class Parent cannot be applied to given types".
Reason: The Parent class has only a parameterized constructor, so Java does not provide a default constructor automatically.
Fix: Explicitly call super("someValue") inside Child(). */