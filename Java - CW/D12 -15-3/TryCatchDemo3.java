// ArrayIndexOutOfBoundsException
// NumberFormatException
// ArithmeticException

class TryCatchDemo3 {
     
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
        }catch(ArrayIndexOutOfBoundsException e ) {      // -------------- here e = exception and ie refrence of class
            System.out.println("OOPS !! Use ARRRAYYYYYYYYYYY elements bro !!!");
        }catch(NumberFormatException e ) {      // -------------- here e = exception and ie refrence of class
            System.out.println("Give INTEGERRRRRRRRR NUMBER !!!");
        }
         
        System.out.println("Execution finished !!!");
    }
}