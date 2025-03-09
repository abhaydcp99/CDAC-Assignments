// Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers.


import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num 1: ");
        int a = sc.nextInt();

        System.out.println("Enter num 2: ");
        int b = sc.nextInt();

        System.out.println("enter ur choice \n1.+ \n2. -\n3.* \n4./ \n5.% \n6.++ \n7. --");

        sc.nextLine();  // Extra line to prevent input issues
        int c = sc.nextInt();  // Reads the user's choice
        

// add : Adds b to a (a = a + b) and prints the result.

        if (c == 1) {
            a += b;
            System.out.println("Add: "+a);
        }
        
// Subtracts b from a (a = a - b) and prints the result.
        
        else if (c == 2){
            a -=b;
            System.out.println("substraction: "+a);
        } 
        
// Multiplies a and b (a = a * b) and prints the result.
   
        else if(c == 3){
            a *= b;
            System.out.println("Multiplication: " + a);
        }

//Divides a by b (a = a / b) and prints the result.
           else if(c == 5){
           a %= b;
           System.out.println("Remainder: " + a);
        } 
        
// Finds the remainder when a is divided by b (a = a % b).
        
        else if(c == 5){
            a %= b;
            System.out.println("Remainder: " + a);
        } 

        
/*Increments a (post-increment) → a = a + 1
Increments b (pre-increment) → b = b + 1 */        
        
        else if(c == 6){
            a++;
            ++b;
            System.out.println("Increment Assignment: " + a + " " + b);

/*Decrements a (post-decrement) → a = a - 1
Decrements b (pre-decrement) → b = b - 1 */

        } else if(c == 7){
            a--;
            --b;
            System.out.println("Decrement Assignment: " + a + " " + b);

        } else {
            System.out.println("INVALID OPTION");
        }

        sc.close();

    }
}
