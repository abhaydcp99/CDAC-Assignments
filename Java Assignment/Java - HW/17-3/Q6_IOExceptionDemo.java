/*6. Implement IOException
Write a Java program that attempts to read from a file that does not exist and catches IOException. */


import java.io.*;

public class Q6_IOExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempting to read from a file that does not exist
            BufferedReader reader = new BufferedReader(new FileReader("nonexistent_file.txt"));
            String line = reader.readLine();
            System.out.println("File content: " + line);
            reader.close();
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        System.out.println("Program continues after handling exception.");
    }
}

/*Error: Could not find or load main class Q6_IOExceptionDemo
Caused by: java.lang.ClassNotFoundException: Q6_IOExceptionDemo */