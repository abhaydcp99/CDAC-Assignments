// Write a program to compare two integers using all relational operators (==, !=, >, <, >=, <=) and display the results.

public class Q10 {
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
 
// Checks if a is greater than or equal to 1.
// Since a = 9, this condition is true, so it prints        
        if (a>=1) {
            System.out.println(a);
        }

// Checks if b is less than 50.
// Since b = 10, this condition is true, so it prints        
        if (b < 50) {
            System.out.println(b);
        }

// Checks if a is equal to b.
// Since a = 9 and b = 10, this condition is false, so nothing prints.        
        if (a==b) {
            System.out.println("same numbers");
        }

// Checks if a is greater than b.
//Since 9 is not greater than 10, this condition is false, so nothing prints.
        
        if (a>b) {
            System.out.println(a + "is greater");
        }


    }
}


/*
 9
10
 */