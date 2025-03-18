import java.util.ArrayList;
import java.util.Scanner;

// Employee class to represent an employee
class Employee {
    int empId;
    String name;
    double salary;
    String phoneNumber;
    String gender;

    // Parameterized constructor to initialize employee details
    Employee(int empId, String name, double salary, String phoneNumber, String gender) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
}

// Main class to demonstrate the Employee Management System
class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create an ArrayList to store employees
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Add initial employees
        employees.add(new Employee(101, "Abhay Sharma", 50000.0, "9876543210", "Male"));
        employees.add(new Employee(102, "Diya Patel", 60000.0, "8765432109", "Female"));
        employees.add(new Employee(103, "Aditi Singh", 55000.0, "7654321098", "Female"));
        employees.add(new Employee(104, "Isha Chavan", 3388688.0, "5635721098", "Female"));

        // Menu for adding new employees
        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add New Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Add a new employee
                    System.out.print("Enter Employee ID: ");
                    int empId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter Employee Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter Employee Gender: ");
                    String gender = scanner.nextLine();

                    // Create a new Employee object and add it to the ArrayList
                    employees.add(new Employee(empId, name, salary, phoneNumber, gender));
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    // Display all employees
                    System.out.println("\nEmployee Details:");
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("ID\tName\t\tSalary\tPhone\t\tGender");
                    System.out.println("------------------------------------------------------------------------------");

                    for (Employee emp : employees) {
                        System.out.println(emp.empId + "\t" + emp.name + "\t" + emp.salary + "\t" + emp.phoneNumber + "\t" + emp.gender);
                    }
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}