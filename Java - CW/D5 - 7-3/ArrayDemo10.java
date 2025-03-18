// passing array method ------------------

// paassing array in method -----------------------

class ArrayDemo10{
	    static void printArray(int[] arr){
			
			//printing of array elements --------------------
			for(int num : arr){
				System.out.println(num);
			}
		}
		
		
    public static void main(String args[]){
        int [] arr = {1,2,3,4,5};
		// called function : passing array refrence ----------------
		// arr is name of array..................
        printArray(arr);  
    }
}	

// ouput : 1,2,3,4,5