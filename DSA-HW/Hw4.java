import java.util.Scanner;

public class Hw4 {

    public static String gcd(int num) {
        if (num == 2) {
            return "GCD(int, int )"; // Base case: Stop when i exceeds the limit
        }
		
		return "GCD ( Int , " + gcd(num-1) + " )" ;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        scanner.close();
        
		if(num<2)
		{
			System.out.println("GCD requires at least two elements !");
		}
		else
		{
				System.out.println(gcd(num));
		}
      
    }
}