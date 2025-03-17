/*4. Implement NumberFormatException
Write a Java program that tries to convert a non-numeric string to an integer using Integer.parseInt() and catches the NumberFormatException. */


public class Q4_NumberFormatExceptionDemo {
    public static void main(String[] args) {
        try {
            // Trying to convert a non-numeric string to an integer
            int num = Integer.parseInt("abc");
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: Invalid number format!");
        }
        
        System.out.println("Program continues after handling exception.");
    }
}

/* Exception caught: Invalid number format!
Program continues after handling exception.*/