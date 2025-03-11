// Parent class
class Employee {
    void work() {
        System.out.println("Working in a company...");
    }
}

// Interface
interface Trainer {
    void conductTraining();
}

// Subclass inheriting from Employee and implementing Trainer
class Manager extends Employee implements Trainer {
    public void conductTraining() {
        System.out.println("Conducting employee training.");
    }
}

// Main class
public class Q1_HybridInheritance {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.work();  // From Employee class
        mgr.conductTraining();  // From Trainer interface
    }
}
