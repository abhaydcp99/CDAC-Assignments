import java.util.Scanner;

/*
Q19: Write a Java program that checks whether a character is uppercase, lowercase, or not a letter using only the ternary operator.
*/

public class Q19_CharacterCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" 
                     : (ch >= 'a' && ch <= 'z') ? "Lowercase" 
                     : "Not a letter";

        System.out.println("The character is: " + result);
        scanner.close();
    }
}
