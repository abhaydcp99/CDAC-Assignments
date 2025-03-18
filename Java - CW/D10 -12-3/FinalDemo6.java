// using final as immutable Refrence :

// A FINAL REFRENCE VARIABLE CANNOT BE REASSIGNNED, BUT THE OBJECTS CONTENT CAN CHANGE.

class FinalDemo6{
    public static void main(String[] args) {
        
    final StringBuilder sb = new StringBuilder("CDAC");
   
   // this below is immutable refrence ::
    System.out.println(sb);

    sb.append("juhu - kharghar");
    System.out.println(sb);
    
    // sb = new StringBuilder("HELLO!!!!");  -- ERROR :: 
   


    // we can do multiple appends in it :--------------
    sb.append("good morning!!!");
    System.out.println(sb);

   }
}
