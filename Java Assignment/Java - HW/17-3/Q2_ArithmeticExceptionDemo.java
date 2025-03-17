/*.2. Implement ArithmeticException
Write a Java program that performs division by zero and catches the ArithmeticException. */



public class Q2_ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero!");
        }
        
        System.out.println("Program continues after handling exception.");
    }
}

/*Exception caught: Cannot divide by zero!
Program continues after handling exception. */