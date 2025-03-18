import java.io.*;

class CheckedDemo7 {
    static void m() throws FileNotFoundException {
       
       System.out.println("Start");
       File f = new File ("abc.txt");
    
       FileReader fr = new FileReader(f); // checked exception
       System.out.println("end");
    }    

    public static void main(String args[]) {
        m();
    }
}

/*Start
Exception in thread "main" java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)   
         */