class Parent{
    
    final void display(){
        System.out.println("Final Method :: parent");
    }
}

class Child extends Parent{
    //void display(){  // ERROR : CTE
    /*     System.out.println("Final method :: Child");
    } */
}



class FinalDemo3A{    
    public static void main(String[] args) { // method   
        Parent p = new Parent();
        p.display();
         Child c = new Child();
         c.display();   
    }
 } 
