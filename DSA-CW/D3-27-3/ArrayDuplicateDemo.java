// method 1 :

// brut force - nested loops
// time complexity : 0(n^2)
//space complexity : 0(1)

class ArrayDuplicateDemo{
    public static void main(String[] args) {
        int[] arr = new int [] {1,2,3,4,2,7,8,8,3};

        // this is our logic for duplicate arrays--
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]== arr[j])
                System.out.println(arr[j]);
            }
        }
    }
}

/*
2
3
8
 */