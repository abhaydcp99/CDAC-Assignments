
// method 2 :: THROWS -------------------------------
// WRITE THROWS ALWAYS WITH MAIN METHOD AS GIVEN BELOW

import java.io.*;
class CheckedDemo1 {
    public static void main(String[] args) throws  IOException {
        
        System.out.println("Enter any character: ");    
        int j = System.in.read();
        System.out.println("Enter char = "+(char)j);
    
    }
}


/*
Enter any character: 
A
Enter char = A */



// THROW : NEW OBJ KA INSTANCE CREATE KARNE K LIYE USE KARTE HAI
// THROWS : YAHA USE KARTE HAI.