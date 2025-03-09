/*
Q24: Write a program that prints all even numbers from 1 to 100
     using only bitwise AND (&) and for loop.
*/

public class Q24_PrintEvenNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i += 2) {
            if ((i & 1) == 0) { // Checking if the number is even
                System.out.print(i + " ");
            }
        }
    }
}
