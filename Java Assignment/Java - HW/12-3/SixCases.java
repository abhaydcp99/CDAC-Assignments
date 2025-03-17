class Parent {
    Parent() {
        System.out.println("Default constructor : P");
    }
    Parent(String msg) {
        System.out.println("Child Parameterized : P");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Default constructor : C");
    }
    Child(String msg) {
        super(msg);
        System.out.println("Child Parameterized : C");
    }
}

public class SixCases {
    public static void main(String[] args) {
        System.out.println("Case 1:");
        Child case1 = new Child();

        System.out.println("\nCase 2:");
        Parent case2 = new Parent();
        Child case2Child = new Child("C");

        System.out.println("\nCase 3:");
        Child case3 = new Child("P");

        System.out.println("\nCase 4:");
        Parent case4 = new Parent();
        Child case4Child = new Child("C");

        System.out.println("\nCase 5:");
        Parent case5 = new Parent();
        Child case5Child = new Child("P");

        System.out.println("\nCase 6:");
        Child case6 = new Child();
        Child case6Child = new Child("C, P");
    }
}
