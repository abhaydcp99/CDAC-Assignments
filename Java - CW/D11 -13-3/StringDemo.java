class StringDemo {
       public static void main(String[] args) {
        


        // METHOD 1: STRING LITERALS -------------------------------------
        String s1 = "ABC";   //here String s1 is refrence i.e STRING LITERAL (constant value) of -- and "ABC":: is string pool"
        String s2 = "ABC";   
        String s3 = "ABCD";   
        String s4 = "ABCD";   
         
        //  == WILL COMPARE REFRENCE CONTENT : ---------------
        //  AND NOT THE OBJECT CONTENT (VALUES) ----------
        //  this method checks ye same object ko target kr raha hai ya nahi ex :: s1 = abhay  s3 = python
        System.out.println((s1==s2));  // true 
        System.out.println((s3==s4));  // true
        System.out.println((s1==s3)); // false 
        

//------------------------------------------------------------------------------------------------------------------------------------------------------------------

        // METHOD 2 :---------------------------------------

        String s5 = new String("ABC");
        String s6 = new String("ABCD");
        System.out.println((s5 == s6)); // false
        System.out.println((s3 == s6)); // false
  
       // .equals()  :: we are comparing values of the refrence

        System.out.println((s1.equals(s5))); // TRUE
        System.out.println((s5.equals(s6))); // false

        String s7 = new String("ABC"); // ABC

        System.out.println(s1);                // ABC
        s1.concat("GOOD MORNING"); 
        System.out.println(s1);                // ABC
        s1 = s1.concat(" GOOD MORNING");   // ABC GOOD MORNING
        System.out.println(s1);

       }    
}
