class TryCatchDemo {
     
    public static void main(String[] args) {
        
        
        try {                        // ------- try block
            int a = 100;
            int result = a/0;
        }catch(ArithmeticException e ) {      // -------------- here e = exception and ie refrence of class
            System.out.println("OOPS !! Cannot divide by Zero !!!");
        }

        System.out.println(result);
    }
}
