



// using try catch -------------------------------




import java.io.*;
class CheckedDemo2 {
    public static void main(String[] args) {
          
        m1();
    }
    static void m1(){

    }   
    static void m2(){
        System.out.println("Enter any character: ");
        try {
            int j = System.in.read();        // exception
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
    
}
