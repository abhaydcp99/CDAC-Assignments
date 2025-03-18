class ArrayIndexOutOfBoundsDemo2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Trying to access an index that does not exist
        System.out.println(numbers[5]); // Index out of bounds (valid indices: 0-4)
    }
}

// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5


// Handling same code :::

class ArrayIndexOutOfBoundsHandled {
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
