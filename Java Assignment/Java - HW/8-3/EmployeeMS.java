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
        // Create an array of Employee objects
        Employee[] employees = new Employee[3];

        // Add employee details to the array
        employees[0] = new Employee(101, "Abhay Sharma", 50000.0, "9876543210", "Male");
        employees[1] = new Employee(102, "Diya Patel", 60000.0, "8765432109", "Female");
        employees[2] = new Employee(103, "Aditi Singh", 55000.0, "7654321098", "Female");

        // Display all employee details
        System.out.println("Employee Details:");
        System.out.println("---------------------------------------------");
        System.out.println("ID\tName\t\tSalary\tPhone\t\tGender");
        System.out.println("---------------------------------------------");

        for (Employee emp : employees) {
            System.out.println(emp.empId + "\t" + emp.name + "\t" + emp.salary + "\t" + emp.phoneNumber + "\t" + emp.gender);
        }
    }
}