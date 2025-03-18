class TryCatchDemo4{
     
    public static void main(String[] args) {
        
        System.out.println("Executin Started !!!");
        String ar[] = {"12", "g"};
        
        try {                        // ------- try block
            String s1 = ar[0];             // String input
            String s2 = ar[1];              // string input
            System.out.println(s1);
            System.out.println(s2);
    
            int i = Integer.parseInt(s1);  // converted string to int datatype by this method
            System.out.println(i);
            int j = Integer.parseInt(s2);
            System.out.println(j);
            int result = i/j;
            
            System.out.println(result); // IF j/i given then this line will print otherwise not .

        }catch(NumberFormatException e ) {      // -------------- here e = exception and ie refrence of class
            System.out.println("Give INTEGERRRRRR numberr!!!!");
        }catch(ArrayIndexOutOfBoundsException e ) {      // -------------- here e = exception and ie refrence of class
            System.out.println("OOPS !! Use ARRRAYYYYYYYYYYY ELEMENTS !!!");
        }catch( ArithmeticException e ) {      // -------------- here e = exception and ie refrence of class
            System.out.println("OOPS !! Cannot divide by Zero !!!");
        }
         
        System.out.println("Execution finished !!!");
    }
}

/*Executin Started !!!
12
g                                                             rectory of the sourcepath
12
Give INTEGERRRRRR numberr!!!!
Execution finished !!!        */