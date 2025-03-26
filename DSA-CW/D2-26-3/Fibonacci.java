public class Fibonacci {

   // below 4 lines are recursive funcction -------------------------
    static int fibonacci(int n){
         if(n <= 1){
            return n;
         }
         return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        int number = 10;                        // how many numbers u want to print
        for(int i=1;i<=number;i++){             // i=1 : ye 1 se start karega || 🔹 Ends when i is greater than number || 🔹 aftre each loop Increases i by 1 .
                                                // i <= number; → Keep running as long as i is less than or equal to number

            System.out.print(fibonacci(i)+" ");

        }
    }
}


/*1 1 2 3 5 8 13 21 34 55  */