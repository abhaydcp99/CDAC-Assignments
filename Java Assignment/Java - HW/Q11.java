// Write a program to check if a number is positive and even using logical operators (&&, ||, !).


import java.util.Scanner;

public class Q11 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number: ");
        int x = sc.nextInt();

/*
Checks two conditions:
x > 0 → Ensures the number is positive.
x % 2 == 0 → Ensures the number is even.
 */

        if(x > 0 && x % 2 == 0){
            System.out.println(x + "is even and positive");
        }
 // for odd        
 // Check if x is positive and odd
        if(x > 0 && x % 2 != 0){
            System.out.println(x + "is odd number");
        }
        sc.close();
      }    
}


/*
for even
enter number: 
2
2 is even and positive number

 for odd
 enter number: 
1
1 is odd number
 */