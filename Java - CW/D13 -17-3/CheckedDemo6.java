
import java.io.*;

class CheckedDemo6 {
    public static void main(String[] args) {
        File f = new File ("abc.txt");
        try {
            FileReader fr = new FileReader(f);          // checked exception
        }catch (FileNotFoundException e) {
        }
    }
}
