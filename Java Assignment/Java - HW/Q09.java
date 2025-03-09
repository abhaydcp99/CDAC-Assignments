// Write a program to perform addition, subtraction, multiplication, division, and modulus operations on two integer numbers and display the results.

import java.util.Scanner;
public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt(); // Reads the input and stores it in a.
        
        System.out.print("Enter second number: ");
		int b = sc.nextInt();
        
        // Displays a menu of arithmetic operations.

        System.out.println("MENU: ");
		System.out.println("1. ADDITION ");
		System.out.println("2. SUBTRACTION ");
		System.out.println("3. MULTIPLICATION ");
		System.out.println("4. DIVISION ");
		System.out.println("5. FIND REMAINDER ");
        
        // Asks the user to choose an option from 1 to 5.

        System.out.print("Enter your Option: ");		
		int c = sc.nextInt();

        while (c!=6) {   // The loop continues until the user enters 6, which is the exit condition.
            
            //Uses a switch statement to check the value of c and perform the corresponding operation.
            switch (c) {
        /*adds*/ case 1:System.out.println("Addition of" +a+"+"+b+"="+(a+b));
                    break;
            
        /*sub*/  case 2: System.out.println("Difference between " + a + " - " + b + " = " + (a-b));
						break;

      /*multi */ case 3: System.out.println("Multiplication of " + a + " x " + b + " = " + (a*b));
						break;
                        
      /*divide */ case 4: System.out.println("Quotient in division of " + a + " / " + b + " = " + ((float)a/(float)b));
						break;
    
      // If the user enters any number other than 1-5, it prints "INVALID OPTION".
                  
                  default: System.out.println("INVALID OPTION");
						break;
            }            
            System.out.print("Enter your Option: ");
			c = sc.nextInt();
        }
        System.out.println("EXITING PROGRAMMING!");
    }
    
}



/*
 Enter first number: 10
Enter second number: 5
MENU:
1. ADDITION 
2. SUBTRACTION 
3. MULTIPLICATION 
4. DIVISION 
5. FIND REMAINDER 
Enter your Option: 1

 */

 /*
Addition of 10 + 5 = 15
Enter your Option: 4
Quotient in division of 10 / 5 = 2.0
Enter your Option: 6
EXITING PROGRAMMING!

  */