
// refer Bsearch program
public class BinarySearch {
     static int BinarySearch(int arr[], int x, int l, int h){
     
     if(h >= l){

        int mid = 1+(h-l)/2;           // formula to calculate mid value
        if (arr[mid] == x)
             return mid;
            if (arr[mid] > x)
              return BinarySearch(arr, x, mid+1, h); 
             
           // if (arr[mid] < x)
                return BinarySearch(arr, x, mid-1, l);    
     }
     return -1;
}   
    
    public static void main(String[] args) {
        int arr[] = {10,50,70,30,20};
        int n = arr.length;                   // not in aaray so element not found
       
        int key = 40;
       
        int result = BinarSearch(arr, key);
        if(result == -1)
            System.out.println("Element not found!");
        else
            System.out.println("Element found!");
        
    }

}

