public class SwapNumbers {
    public static void main(String[] args) {
        // Swapping using a temporary variable
        int a = 5, b = 10;
        System.out.println("Before Swapping (Using Temp Variable): a = " + a + ", b = " + b);

        int temp = a; // Store 'a' in temp
        a = b;        // Assign 'b' to 'a'
        b = temp;     // Assign 'temp' (old 'a') to 'b'

        System.out.println("After Swapping (Using Temp Variable): a = " + a + ", b = " + b);

        // Swapping without using a temporary variable
        int x = 5, y = 10;
        System.out.println("\nBefore Swapping (Without Temp Variable): x = " + x + ", y = " + y);

        x = x + y; // Step 1: x becomes sum of x and y
        y = x - y; // Step 2: y gets original value of x
        x = x - y; // Step 3: x gets original value of y

        System.out.println("After Swapping (Without Temp Variable): x = " + x + ", y = " + y);
    }
}


/*
Before Swapping (Using Temp Variable): a = 5, b = 10
After Swapping (Using Temp Variable): a = 10, b = 5

Before Swapping (Without Temp Variable): x = 5, y = 10
After Swapping (Without Temp Variable): x = 10, y = 5


*/