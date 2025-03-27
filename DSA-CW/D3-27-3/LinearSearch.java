class LinearSearch {
    static int search(int arr[], int x){
           int n = arr.length;
           for(int i=0;i<n;i++){
            if(arr [i] == x){
                  return i;    // 2
            }
           }
           return -1;          // means index k piche jayega
    } 
    public static void main(String[] args) {
        int arr[] = {10,50,70,30,20};
        int key = 90;                     // not in aaray so element not found
       
        /*int key = 10;                     // NO . COMPARISON =1  BEST CASE
        int key = 20;                     // NO.COMPARISON = 5 WORST CASE
        int key = 70;   */                  //NO.COMPARISON = 3 AVAERAGE CASE
       
        int result = search(arr, key);
        if(result == -1)
            System.out.println("Element not found!");
        else
            System.out.println("Element found!");
        
    }

}

/*Element not fount! */


// PEHALA ELEMENT SEARCH KAROGE TOH KAM TIME LAGEGA
// LAST KO JYADA 