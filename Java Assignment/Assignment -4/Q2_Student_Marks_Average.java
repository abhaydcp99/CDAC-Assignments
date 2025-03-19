class Student {
    // Data members
    private String name;
    private int marks1, marks2, marks3;

    // Method to assign initial values
    public void setValues(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Method to compute total marks
    public int getTotalMarks() {
        return marks1 + marks2 + marks3;
    }

    // Method to compute average marks
    public double getAverageMarks() {
        return getTotalMarks() / 3.0;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Average Marks: " + getAverageMarks());
    }
}

public class Q2_Student_Marks_Average {
    public static void main(String[] args) {
        // Creating student object
        Student student1 = new Student();
        student1.setValues("Alice", 85, 90, 80);

        // Displaying student details
        student1.displayDetails();
    }
}
