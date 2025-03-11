// Parent class
class Father {
    void showSurname() {
        System.out.println("Surname: Smith");
    }
}

// Child class (inherits from Father)
class Son extends Father {
    void showName() {
        System.out.println("First Name: John");
    }
}

// Main class
public class Q1_SingleInheritance {
    public static void main(String[] args) {
        Son child = new Son();
        child.showName();      // Calls method from Son class
        child.showSurname();   // Calls method from Father class (inherited)
    }
}
