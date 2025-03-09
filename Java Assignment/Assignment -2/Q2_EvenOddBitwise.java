// Q2: Write a program to check whether a given number is even or odd using only bitwise operators. Hint: Use n & 1 to check. 


public class Q2_EvenOddBitwise {
    public static void main(String[] args) {
        int num = 7;
        if ((num & 1) == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}