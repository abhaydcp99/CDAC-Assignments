class TryCatchDemo2 {
     
    public static void main(String[] args) {
        
        System.out.println("Executin Started !!!");
        String s1 = "12";             // String input
        String s2 = "0";              // string input


        int i = Integer.parseInt(s1);  // converted string to int datatype by this method
        int j = Integer.parseInt(s2);

        
        try {                        // ------- try block
            int result = i/j;        // EXCEPTION => 12/0

            System.out.println(result); // IF j/i given then this line will print otherwise not .

        }catch(ArithmeticException e ) {      // -------------- here e = exception and ie refrence of class
            System.out.println("OOPS !! Cannot divide by Zero !!!");
        }

        System.out.println("Execution finished !!!");
    }
}


// if j/i is given :::::::::::

/*Executin Started
OOPS !! Cannot divide by Zero !!!
Execution finished !!! */


// if j/i is given :::::::::::

/*Executin Started
0
Execution finished !!! */