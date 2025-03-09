import java.util.Scanner;

/*
Q18: Given a student’s percentage, print “Pass” if the percentage is 40 or above; otherwise, print “Fail”, using only the ternary operator.
*/

public class Q18_PassOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student percentage: ");
        int percentage = scanner.nextInt();

        String result = (percentage >= 40) ? "Pass" : "Fail";

        System.out.println("Result: " + result);
        scanner.close();
    }
}
