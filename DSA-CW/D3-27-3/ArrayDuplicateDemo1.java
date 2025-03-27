// method 2: 


import java.util.*;

class ArrayDuplicateDemo1{
    public static void main(String[] args) {
        int[] arr = new int [] {1,2,3,4,2,7,8,8,3};

        // unsorted array
        System.out.println(Arrays.toString(arr));
        
        //sorted array
        Arrays.sort(arr);                           // -- 0(nLogn) 
        System.out.println(Arrays.toString(arr));
    
        
        /*  this is our logic for duplicate arrays--
        
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]== arr[j])
                System.out.println(arr[j]);
            }
        }*/
    }
}

/*
[1, 2, 3, 4, 2, 7, 8, 8, 3]
[1, 2, 2, 3, 3, 4, 7, 8, 8]       -- arranged properly
 */