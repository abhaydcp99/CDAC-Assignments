/*5. Implement IllegalArgumentException
Write a Java method setAge(int age) that throws an IllegalArgumentException if the age is negative or greater than 150. */


public class Q5_IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        try {
            setAge(-5); // Invalid age
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Invalid age: " + age);
        }
        System.out.println("Valid age set: " + age);
    }
}


/*Exception caught: Invalid age: -5 */