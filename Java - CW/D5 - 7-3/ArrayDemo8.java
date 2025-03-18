import java.util.Scanner;

class ArrayDemo8{

    public static void main(String [] args){
	    Scanner sc = new Scanner(System.in);
		int arr[] [] = new int [3] [3]; // its bcz 3 by 3 matrix
		
		// put here a , b and c for answer--------------
		
		
		// input for matrix : 1
		// input from user -------------------------
		for(int i=0;i<3;i++){
		    for(int j=0; j<3;j++){      // this 2nd for loop for 2nd line
			     System.out.println("Enter element:");
				 arr[i][j] = sc.nextInt();
			}
		}
		
		// input for matrix : 2
		// input from user -------------------------
		for(int i=0;i<3;i++){
		    for(int j=0; j<3;j++){      // this 2nd for loop for 2nd line
			     System.out.println("Enter element:");
				 arr[i][j] = sc.nextInt();
			}
		}

        // logic addition here : ------------- for hw


// printing code :---------------------------------------------
        System.out.println("---------------------");
        for(int ar[] : arr2)
        {
            for(int x : ar){
            System.out.println(" "+x);
		    }
		    System.out.println();
	    }
    }
}	
