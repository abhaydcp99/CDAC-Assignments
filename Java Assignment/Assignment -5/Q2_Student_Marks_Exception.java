import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
    // Data members
    private String name;
    private int rollNo;
    private double[] marks;
    private double average;
    private char grade;

    // Constructor to initialize values
    public Student(String name, int rollNo, double[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        
        for (double mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new IllegalArgumentException("Marks must be between 0 and 100.");
            }
        }
    }

    // Method to calculate average marks
    public void calculateAverage() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        this.average = total / marks.length;
    }

    // Method to calculate grade
    public void calculateGrade() {
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class Q2_Student_Marks_Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Taking user input
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter roll number: ");
            int rollNo = scanner.nextInt();
            
            double[] marks = new double[5];
            System.out.println("Enter marks for 5 subjects:");
            for (int i = 0; i < 5; i++) {
                marks[i] = scanner.nextDouble();
            }
            
            // Creating Student object
            Student student = new Student(name, rollNo, marks);
            student.calculateAverage();
            student.calculateGrade();
            student.displayStudentInfo();
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values for roll number and marks.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
