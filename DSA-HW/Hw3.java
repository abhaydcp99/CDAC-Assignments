import java.util.Scanner;

public class Hw3 
{
    public static void printTable(int num, int i, int limit) 
	{
        if (i > limit) {
            return; // Base case: Stop when i exceeds the limit
        }
        System.out.println(num + " × " + i + " = " + (num * i));
        printTable(num, i + 1, limit); 
		// Recursive call with incremented i
    }

    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();
        scanner.close();
        
        System.out.println("Multiplication Table of " + num + ":");
        printTable(num, 1, limit);
		
    }
}