// Grandparent class
class Grandfather {
    void showFamilyHistory() {
        System.out.println("Grandfather was a doctor.");
    }
}

// Parent class (inherits from Grandfather)
class Father extends Grandfather {
    void showProfession() {
        System.out.println("Father is an engineer.");
    }
}

// Child class (inherits from Father)
class Son extends Father {
    void showHobby() {
        System.out.println("Son loves painting.");
    }
}

// Main class
public class Q1_MultilevelInheritance {
    public static void main(String[] args) {
        Son child = new Son();
        child.showFamilyHistory();  // Grandfather's method
        child.showProfession();     // Father's method
        child.showHobby();          // Son's own method
    }
}
