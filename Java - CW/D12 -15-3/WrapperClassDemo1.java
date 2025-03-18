class WrapperClassDemo1 {
    public static void main(String[] args) {
        
        int a = 20; // primitive data
        long l1 = 20L;

        Integer x = new Integer(20); // here value is int :::::  wrapper class
        Integer i1 = new Integer("20"); // its string value
    




// below is auto boxing --- ie >> ------------------------------
// homework ------



//  1 :: valueOf() -----------------------
        Integer i = Integer.valueOf(a); // its implicit conversion
        Byte b = Byte.valueOf("20"); // its implicit conversion
        Short s = Short.valueOf("20"); // its implicit conversion
        Long l = Long.valueOf("20"); // its implicit conversion
    
        WrapperClassDemo1 w1 = new WrapperClassDemo1();


// 2 ::  compiler auto conversion -----------------
        Integer j = a;     // no error 

        System.out.println(j);
    }
}


// value of ka kam :: 