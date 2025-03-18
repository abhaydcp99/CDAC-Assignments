class FinalDemo2 {
      
    final static int SPEED_LIMIT = 100; // FINAL VARIABLE


    void display()
    {
       System.out.println(SPEED_LIMIT);
    }

}


class FinalDemo3{    
   public static void main(String[] args) { // method   
       FinalDemo2 f1 = new FinalDemo2();
       f1.display();
       
   }
}

