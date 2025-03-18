
// automatic conversion ::: autoboxing
// manual conversion    ::: unboxing



class WrapperDemo1 {
    public static void main(String[] args) {
        
        Integer a = new Integer("30");
        
        // method 1 ::
        int j = a;   //  automatic conversion ::: by compiler
        System.out.println(j);
        
        
        // method 2 ::
        int i = a.intValue();   // explicit conversion call ie manual method ::: Unboxing
        System.out.println(j);

    }    
}
