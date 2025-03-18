import java.io.*;
class CheckedDemo4 {
    public static void main(String[] args)  {  // USE THIS LINE OR PUT IT IN TRY CATCH 
        
        // use above line or below try catch as u want ------
        
    try{    
        m1();
        }catch (IOException e) {  
        System.out.println("checked !!");
    }

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