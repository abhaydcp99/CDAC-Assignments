class FinalDemo2 {
      
     final static int SPEED_LIMIT = 100; // FINAL VARIABLE


     void display()
     {
        System.out.println(SPEED_LIMIT);
     }

    public static void main(String[] args) { // method   
        FinalDemo2 f1 = new FinalDemo2();
        //FinalDemo2 f2 = new FinalDemo2(111);
        f1.display();
        
    }
}


// we can use static within instannce variable
