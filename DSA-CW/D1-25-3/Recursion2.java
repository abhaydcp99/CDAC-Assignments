class Recursion2 {
     static void show(int n){

        if(n==4) // base condition
        {
            return n;
        }
        else{
             return 2*show(n+1);
        }
    }
  
    public static void main(String[]args){
        show(2);
    }    
}
