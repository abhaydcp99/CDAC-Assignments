int add(int a, int b, int c)
{
    return a+b+c;
}
// static method --------------------

static int add(int a, long b)
{
    return a+b;
}

static float add(long a, double b)
{
    retur a+b;
}



class OverLoadingDemo1{
    public static void main(String[] args) {
        
        Add a1 = new Adder();
        a1.add(2, 4); // instance method

        Adder.add(2,3); // static method
        Adder.add(2,3,5);
        Adder.add(2,3,5f,6);
    }
}





// return type overloading :---------------


// method name + parameters:=> overloading
// return type ka isme koi role nahi hai....



// Type promotion :
/*
 add(int, int long) => long
 add(int, long, int) => long
 
 int -> long -> float -> double

 TYPE PROMOTION AMBIGUITY:

  add(int a, long b){}

  add (long x, int y){
  }        --- call
  add(3, 7l)
 */












class OverLoadingDemo1 {
       public static void main(String[] args) {
        
       }    
}
