
// using throws -------------------

import java.io.*;
class CheckedDemo3 {
    public static void main(String[] args) throws IOException  {  // USE THIS LINE OR PUT IT IN TRY CATCH 
        
        // use above line or below try catch as u want ------
        
    /*try{    
        m1();
        }catch (IOException e) {  
        System.out.println("checked !!");
    }*/

    System.out.println("3");
}
    static void m1() throws IOException{
        System.out.println("1");
        m2();
        System.out.println("1");
    }   
    static void m2() throws IOException{
        System.out.println("2");
        System.out.println("Enter any character: ");
        int j = System.in.read();        // exception
        
        System.out.println("Enter char =  "+(char)j);
        System.out.println("2");
    } 
    
}



/* using throws at first line  ::
1
2                                                       ckedDemo2.java
Enter any character:                                    kedDemo2
k                                                       ckedDemo2.java
Enter char =  k                                         kedDemo2      
2
1
3 */








/* using try catch ::
1
2
Enter any character:
k
Enter char =  k
2
1
3
 */