import java.util.Scanner;

/*
Q7: Implement a Java program that checks whether a given year 
    is a leap year or not using logical (&&, ||) operators.
*/

public class Q7_LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println(year + (isLeap ? " is a Leap Year." : " is not a Leap Year."));
        scanner.close();
    }
}
