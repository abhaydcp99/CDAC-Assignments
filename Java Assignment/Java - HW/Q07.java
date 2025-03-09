// Write a program that uses boolean literals to control program flow in an if-else statement.

public class Q07 {
    public static void main(String[] args) {
        boolean check = true;
        if(check){
            System.out.println("in if block");
        }else{
            System.out.println("in another if block");
        }
        check = false;
//This is a do-while loop. 2 - The do block runs at least once, even if check is false.
        do{
            System.out.println("Executes once");
        }while(check);
    }
}

/*
 in if block
Executes once


note : 
1-if-else works normally: If the condition is true, the if block runs; otherwise, the else block runs.
2- do-while executes at least once: Unlike a normal while loop, it runs once before checking the condition
 */