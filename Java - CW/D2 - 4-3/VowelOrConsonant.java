import java.util.Scanner; // Import Scanner class

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Taking input from user
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); // Read a single character

        // Convert to lowercase to handle both uppercase and lowercase input
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel.");
        }
        // Check if the character is a consonant (i.e., an alphabet)
        else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is a Consonant.");
        }
        // If not an alphabet, print an error message
        else {
            System.out.println("Invalid input! Please enter an alphabet letter.");
        }

        scanner.close(); // Close Scanner
    }
}
