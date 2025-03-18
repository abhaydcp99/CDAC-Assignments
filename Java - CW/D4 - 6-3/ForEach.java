import java.util.Scanner;

class ForEach{
    public static void main(String []args){
	    Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		
		// input in the array --------------------------
		
		/*for(int i=0;i<arr.length;i++)
		{
		    System.out.println("Enter element:");
			arr[i] = sc.nextInt();
		}*/
        
		// for each loop -----------------------------------------
		
        for(int a : arr){
            System.out.println(a);
        }
	}
}