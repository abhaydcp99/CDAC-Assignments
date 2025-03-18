// Matrix Addition 

import java.util.* ;
import java.lang.*;


class Add {
 
   
   
   int [][]arr1 = new arr1[3][] ;
   int [][]arr2 = new arr2[3][] ;
   
   
   Scanner sc = new Scanner(System.in) ;
   
   
   
      // input arr1
     for(int i = 0 ; i < arr1.length ; i++)
	 {
		 for(int j = 0 ; i < arr1[i].length ; j++)
		 {
			 
			System.out.println("Enter the value: ");
			arr1[i][j] = sc.nextInt() ;
		 }
	 }
	 
	 // input arr2
	 for(int i = 0 ; i < arr2.length ; i++)
	 {
		 for(int j = 0 ; i < arr2[i].length ; j++)
		 {
			 
			System.out.println("Enter the value: ");
			arr2[i][j] = sc.nextInt() ;
		 }
	 }
  
     // matrix addition 
	  
	  int[][] res =  new int[3][3] ; 
	  // addition of 2 matrix 
	   for(int i = 0 ; i < res.length ; i++)
	 {
		 for(int j = 0 ; i < res[i].length ; j++)
		 {
			 res[i][j] = arr1[i][j] + arr2[i][j] ;
			
		 }
	 }
	  // matrix addition print 
	    System.out.println("Addition of two sMatrix  ");
	  
        for(int i = 0 ; i < res.length ; i++)
	 {
		 for(int j = 0 ; i < res[i].length ; j++)
		 {
			System.out.println( res[i][j]);
		 }
	 }	 



    


	 

}

class MatrixAdd  
{
	
	public static void main(String Args[])
	{
	    Add a = new Add() ;	
		
	}
	
	
}