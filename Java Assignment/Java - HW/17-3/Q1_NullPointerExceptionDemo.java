/*1. Implement NullPointerException
Write a Java program where you initialize a String as null and try to call the .length() method on it. Handle the exception using a try-catch block.
*/

public class Q1_NullPointerExceptionDemo {
    public static void main(String[] args) {
        String str = null; // Initializing a string as null
        
        try {
            // Trying to call length() on a null reference
            int length = str.length();
            System.out.println("String length: " + length);
        } catch (NullPointerException e) {
            // Handling NullPointerException
            System.out.println("Exception caught: Null value encountered!");
        }
        
        System.out.println("Program continues after handling exception.");
    }
}

/*Exception caught: Null value encountered!
Program continues after handling exception. */