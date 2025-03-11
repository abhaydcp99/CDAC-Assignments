// Interface 1
interface Employee {
    void work();
}

// Interface 2
interface Musician {
    void playInstrument();
}

// Class implementing both interfaces
class Person implements Employee, Musician {
    public void work() {
        System.out.println("Working as a Software Engineer.");
    }

    public void playInstrument() {
        System.out.println("Plays Guitar in free time.");
    }
}

// Main class
public class Q1_MultipleInheritance {
    public static void main(String[] args) {
        Person p = new Person();
        p.work();
        p.playInstrument();
    }
}
