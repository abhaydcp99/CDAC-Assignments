import java.util.*;

class ArrayDuplicateDemo2 {
      
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4,2,7,8,8,3};

        // unsorted array
        System.out.println(Arrays.toString(arr));

        Set<Integer> s1 = new HashSet<>();
        for(int x : arr){
            if(!s1.add(x)){
                System.out.println(x);
            }
        }
    }
}


/*
[1, 2, 3, 4, 2, 7, 8, 8, 3]
2
8
3 
 */