//Write a program to calculate the average of three int numbers using typecasting to display the result in double.

import java.util.Scanner;
public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double avg;
        System.err.println("Enter num 1: ");
        int a = sc.nextInt();
        System.err.println("Enter num 2: ");
        int b = sc.nextInt();
        System.err.println("Enter num 3: ");
        int c = sc.nextInt();


        // using typecasting to display the result in double.

        avg = ((double)a +(double)b + (double)c);
        System.err.printf("Average of 3: %.2f", avg);
    }
}

/* 
Enter num 2: 
12
Enter num 3: 
12
Average of 3: 36.00
*/