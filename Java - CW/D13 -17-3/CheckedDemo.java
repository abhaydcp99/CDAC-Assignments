// IO Exception -----------------------------



import java.io.*;
class CheckedDemo {
    public static void main(String[] args) {
        
        //int i = Integer.parseInt("ab");     // UNCHECKED EXCEPTON
        //int j = System.in.read();


        // method 1 : try catch --------
        
        try{
            int j = System.in.read();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}


/*Exception in thread "main" java.lang.NumberFormatException: For input string: "ab"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:662)
        at java.base/java.lang.Integer.parseInt(Integer.java:778)
        at CheckedDemo.main(CheckedDemo.java:9) */
