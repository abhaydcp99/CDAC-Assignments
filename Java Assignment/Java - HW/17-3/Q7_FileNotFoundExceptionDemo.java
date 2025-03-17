/*7. Implement FileNotFoundException
Write a Java program that tries to open a file that does not exist using FileReader, and handle the FileNotFoundException. */


import java.io.*;

public class Q7_FileNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            // Trying to open a file that does not exist
            FileReader fileReader = new FileReader("nonexistent_file.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            System.out.println("File content: " + line);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: File not found!");
        } catch (IOException e) {
            System.out.println("Exception caught: Error reading the file!");
        }
        
        System.out.println("Program continues after handling exception.");
    }
}


/* Error: Could not find or load main class Q7_FileNotFoundExceptionDemo    
Caused by: java.lang.ClassNotFoundException: Q7_FileNotFoundExceptionDemo*/