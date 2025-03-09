import java.util.Scanner;

/*
Q8: Write a program that takes three boolean inputs and prints true 
    if at least two of them are true. 
    Hint: Use logical operators (&&, ||).
*/

public class Q8_AtLeastTwoTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three boolean values (true/false): ");
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();

        boolean result = (a && b) || (b && c) || (a && c);

        System.out.println("At least two are true: " + result);
        scanner.close();
    }
}
