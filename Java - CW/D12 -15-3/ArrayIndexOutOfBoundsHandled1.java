class ArrayIndexOutOfBoundsHandled1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[10]); // Index 10 does not exist
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        }

        System.out.println("Program continues normally...");
    }
}

/*Error: Array index out of bounds!
Program continues normally...
 */