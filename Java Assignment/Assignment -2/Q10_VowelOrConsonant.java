import java.util.Scanner;

/*
Q10: Write a program to determine if a character is a vowel 
     or a consonant using the ternary operator.
*/

public class Q10_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        ch = Character.toLowerCase(ch);

        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 
                        "Vowel" : "Consonant";

        System.out.println(ch + " is a " + result);
        scanner.close();
    }
}
