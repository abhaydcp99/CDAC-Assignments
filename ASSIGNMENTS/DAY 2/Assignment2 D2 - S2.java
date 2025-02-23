
Assignment 2                                                                                                                             18/02/25
Section 2: Java Programming with Conditional Statements 


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Question 1: Grade Classification 
Write a program to classify student grades based on the following criteria: 
 If the score is greater than or equal to 90, print "A" 
 If the score is between 80 and 89, print "B" 
 If the score is between 70 and 79, print "C" 
 If the score is between 60 and 69, print "D" 
 If the score is less than 60, print "F" 


Ans :  /*import java.util.Scanner;
    public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = sc.nextInt();
        sc.close();
        if (score >= 90) System.out.println("A");
        else if (score >= 80) System.out.println("B");
        else if (score >= 70) System.out.println("C");
        else if (score >= 60) System.out.println("D");
        else System.out.println("F");
    }
}
*/
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Question 2: Days of the Week 
Write a program that uses a nested switch statement to print out the day of the week based on an 
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it 
is a weekday or weekend. 

Ans :/*import java.util.Scanner;
    public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();
        sc.close();
        switch(day) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Weekday");
                break;
            case 6: case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}*/
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Question 3: Calculator 
Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested ifelse to check if division by zero is attempted and display an error message. 


Ans : /*import java.util.Scanner;
    public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        sc.close();
        switch(op) {
            case '+': System.out.println("Result: " + (num1 + num2)); break;
            case '-': System.out.println("Result: " + (num1 - num2)); break;
            case '*': System.out.println("Result: " + (num1 * num2)); break;
            case '/': 
                if (num2 != 0) System.out.println("Result: " + (num1 / num2));
                else System.out.println("Error: Division by zero");
                break;
            default: System.out.println("Invalid operator");
        }
    }
}
*/
     
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Question 4: Discount Calculation 
Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%. 

Ans : /* import java.util.Scanner;
    public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total purchase amount: ");
        double amount = sc.nextDouble();
        System.out.print("Do you have a membership card? (yes/no): ");
        boolean hasMembership = sc.next().equalsIgnoreCase("yes");
        sc.close();
        
        double discount = (amount >= 1000) ? 20 : (amount >= 500) ? 10 : 5;
        if (hasMembership) {
            discount += 5;
        }
        double finalAmount = amount - (amount * discount / 100);
        System.out.println("Final price after " + discount + "% discount: Rs." + finalAmount);
    }
}*/


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Question 5: Student Pass/Fail Status with Nested Switch 
Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in. 


Ans : /* import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {
        // Scanner to input grades from the user
        Scanner scanner = new Scanner(System.in);

        // Input grades for three subjects
        System.out.print("Enter grade for subject 1: ");
        int grade1 = scanner.nextInt();
        System.out.print("Enter grade for subject 2: ");
        int grade2 = scanner.nextInt();
        System.out.print("Enter grade for subject 3: ");
        int grade3 = scanner.nextInt();

        // Initialize fail count
        int failCount = 0;

        // Check the grades for each subject using nested switch
        switch (grade1 > 40 ? 1 : 0) {
            case 1: // Passed in subject 1
                break;
            case 0: // Failed in subject 1
                failCount++;
                break;
        }

        switch (grade2 > 40 ? 1 : 0) {
            case 1: // Passed in subject 2
                break;
            case 0: // Failed in subject 2
                failCount++;
                break;
        }

        switch (grade3 > 40 ? 1 : 0) {
            case 1: // Passed in subject 3
                break;
            case 0: // Failed in subject 3
                failCount++;
                break;
        }

        // Output the result
        if (failCount == 0) {
            System.out.println("The student passed in all subjects.");
        } else {
            System.out.println("The student failed in " + failCount + " subjects.");
        }

        scanner.close();
    }
}
*/