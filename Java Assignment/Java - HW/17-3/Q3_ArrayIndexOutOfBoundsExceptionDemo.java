/*3. Implement ArrayIndexOutOfBoundsException
Create an array of 5 elements and try to access an index that does not exist (e.g., index 10). Handle the exception properly. */



public class Q3_ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Array with 5 elements
        
        try {
            // Trying to access an index that does not exist
            System.out.println("Accessing element at index 10: " + arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Index out of bounds!");
        }
        
        System.out.println("Program continues after handling exception.");
    }
}

/*Exception caught: Index out of bounds!
Program continues after handling exception. */
