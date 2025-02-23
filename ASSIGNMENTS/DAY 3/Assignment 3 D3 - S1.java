                                  Assignment 3

_______________________________________________________________________________

Snippet 1:  
public class InfiniteForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i--) { 
            System.out.println(i); 
        } 
    } 
} 
// Error to investigate: Why does this loop run infinitely? How should the loop control variable be adjusted? 

ans: // Goes in Infinite loop
     //i < 10 is always true, the loop never stops.

public class FixedForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // Use i++ instead of i--
            System.out.println(i);
        }
    }
}

//I used i++ (increment) ensures i increases instead of decreasing

-------------------------------------------------------------------------------------
Snippet 2:  
public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count = 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
} 
// Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the 
`while` loop?

ans: //error: incompatible types: int cannot be converted to Boolean
//
count = 0 is an assignment, not a comparison.

public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count > 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
} 

----------------------------------------------------------------------------------------
Snippet 3:  
public class DoWhileIncorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num > 0); 
 
 
    } 
} 
// Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `do
while` loop? 

ans://while (num >= 0); // Condition always true, runs forever


public class DoWhileCorrectCondition {
    public static void main(String[] args) {
        int num = 0;
        do {
            System.out.println(num);
            num++;
        } while (num < 10); 
    }
}

//while (num < 10); // Runs while num is less than 10

-------------------------------------------------------------------------------------------
Snippet 4:  
public class OffByOneErrorForLoop { 
    public static void main(String[] args) { 
        for (int i = 1; i <= 10; i++) { 
            System.out.println(i); 
        } 
        // Expected: 10 iterations with numbers 1 to 10 
        // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
    } 
} 
// Error to investigate: What is the issue with the loop boundaries? How should the loop be adjusted to meet the 
expected output?

ans://i starts at 1 and runs until it is 10 (i <= 10), resulting in 10 iterations.
//loop runs one extra iteration beyond what is expected.

public class OffByOneErrorForLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) { 
            System.out.println(i);
        }
    }
}

// Change `<= 10` to `< 10`

------------------------------------------------------------------------------------------\

Snippet 5:  
public class WrongInitializationForLoop { 
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i++) { 
            System.out.println(i); 
        } 
    } 
} 
// Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the 
initialization and update statements in the `for` loop?

ans://Loop is supposed to count downwards, but i is being incremented (i++)

public class CorrectInitializationForLoop { 
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i--) {  
            System.out.println(i);
        } 
    } 
}
// Decrement i instead of incrementing

------------------------------------------------------------------------------------------
Snippet 6:  
public class MisplacedForLoopBody { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) 
            System.out.println(i); 
            System.out.println("Done"); 
    } 
} 
// Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to 
include all statements within the loop? 

ans://because of missing curly braces {} around the for loop body. System.out.println(i); // This is the only statement inside the loop.


public class MisplacedForLoopBody { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) {  // Add curly braces
            System.out.println(i);
            System.out.println("Done");
        } 
    } 
} 
 

// Add curly braces

-------------------------------------------------------------------------------------------
Snippet 7:  
public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count; 
 
 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
} 
// Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop 
variable properly? 

ans:// variable count might not have been initialized

public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count = 0;  // Initialize count

        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
}

//count variable initialized with a value (0).

-------------------------------------------------------------------------------------------
Snippet 8:  
public class OffByOneDoWhileLoop { 
    public static void main(String[] args) { 
        int num = 1; 
        do { 
            System.out.println(num); 
            num--; 
        } while (num > 0); 
    } 
} 
// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the 
numbers from 1 to 5? 

ans://loop decreases (num--) instead of increasing, which causes num to immediately become 0 after the first iteration.
//also condition given in code (num > 0) insted of (num <= 5)

public class OffByOneDoWhileLoop {
    public static void main(String[] args) {
        int num = 1;
        do {
            System.out.println(num);
            num++; 
        } while (num <= 5); 
    }
} 

// Increment instead of decrement
// Change condition to stop at 5

-------------------------------------------------------------------------------------------
Snippet 9:  
public class InfiniteForLoopUpdate { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i += 2) { 
            System.out.println(i); 
        } 
    } 
} 
// Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update 
expression be corrected? 

ans://loop does not run infinitely, but it does not print all expected values

public class FixedForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) {  
            System.out.println(i);
        } 
    } 
}
 
// Increment i by 1

-------------------------------------------------------------------------------------------
Snippet 10:  
public class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num = 10) { 
            System.out.println(num); 
            num--; 
        } 
    } 
} 
// Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition? 

ans://error: incompatible types: int cannot be converted to boolean
//The expression num = 10 is an assignment statement, not a condition.

public class CorrectWhileLoopControl {
    public static void main(String[] args) {
        int num = 10;
        while (num == 10) {  
            System.out.println(num);
            num--;  
        }
    }
}

// Correct comparison
// This will decrease num, so the loop exits after 1 iteration
-------------------------------------------------------------------------------------------
Snippet 11:  
public class IncorrectLoopUpdate { 
    public static void main(String[] args) { 
        int i = 0; 
        while (i < 5) { 
            System.out.println(i); 
            i += 2; // Error: This may cause unexpected results in output 
        } 
    } 
} 
// Error to investigate: What will be the output of this loop? How should the loop variable be updated to achieve the 
desired result? 

ans://code does not contain a syntax error, but it may produce unexpected results because of the way the loop variable i is updated.

public class CorrectLoopUpdate { 
    public static void main(String[] args) { 
        int i = 0; 
        while (i < 5) { 
            System.out.println(i); 
            i += 1; 
        } 
    } 
}

// Update correctly to avoid skipping numbers

-------------------------------------------------------------------------------------------
Snippet 12:  
public class LoopVariableScope { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
            int x = i * 2; 
        } 
        System.out.println(x); // Error: 'x' is not accessible here 
    } 
} 
// Error to investigate: Why does the variable 'x' cause a compilation error? How does scope 

ans://Error: 'x' is not accessible here
//x is declared inside the for loop

public class LoopVariableScope { 
    public static void main(String[] args) { 
        int x = 0;  
        for (int i = 0; i < 5; i++) { 
            x = i * 2; 
        } 
        System.out.println(x); 
    } 
}

// Declare x outside the loop
// Modify x inside the loop
// No error: x is accessible here
-------------------------------------------------------------------------------------------
