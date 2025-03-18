// MATRIX ADDITION -----------------------------------------

import java.util.* ;

class MatrixAdd{
	
		public static void main(String args[])
		{
			

		Scanner sc = new Scanner(System.in);
		
		int [][]arr = new int[3][3];
		int [][]arr1 = new int[3][3];
		
		System.out.println("Enter matrix value");
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
			
			System.out.println("enter the value of "+ i +" "+ j );
			arr[i][j] = sc.nextInt();
			
			}
		
		}
		
		//input arr1
		System.out.println("Enter 2nd matrix value");
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[i].length; j++)
			{
			
			System.out.println("enter the value of"+ i +" "+ j );
			arr1[i][j] = sc.nextInt();
			
			}
		
		}
		
		//Mattrix addition
		
		System.out.println("Mattrix Addition");
		
		int [][]add = new int[3][3];
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[i].length; j++)
			{
			
			add[i][j] = arr[i][j] + arr1[i][j];
			
			}
		
		}
		
		for(int x[] : add)
		{
			for(int y:x)
			{	
				System.out.print(" "+y);
			}
			System.out.println();
		}
		
		
		
		}
	}