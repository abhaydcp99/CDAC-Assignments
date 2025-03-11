// Parent class
class Teacher {
    void teach() {
        System.out.println("Teaching students...");
    }
}

// Child class 1
class MathTeacher extends Teacher {
    void teachMath() {
        System.out.println("Teaching Mathematics.");
    }
}

// Child class 2
class ScienceTeacher extends Teacher {
    void teachScience() {
        System.out.println("Teaching Science.");
    }
}

// Main class
public class Q1_HierarchicalInheritance {
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher();
        ScienceTeacher scienceTeacher = new ScienceTeacher();

        System.out.println("Math Teacher:");
        mathTeacher.teach();    // Inherited method
        mathTeacher.teachMath(); // Specific to MathTeacher

        System.out.println("\nScience Teacher:");
        scienceTeacher.teach();    // Inherited method
        scienceTeacher.teachScience(); // Specific to ScienceTeacher
    }
}
