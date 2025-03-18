class A{
    void show(){
        System.out.println("Parent class");
    }
}

class B extends A{
    void show(){
        System.out.println("Child class");
    }
}

class C extends B{
    Void show(){
        System.out.println("Downcasting : samzaaa");
    }
}


class Upcasting{
    public static void main(String args[]){

        A a1 = new A(); 
        B b1 = new B();
        A a2 = new B();  // UPCASTING :: POLYMORPHISM

// downcasting ----------------------------------------------------        

        // below method is not allowed for downcasting 
        //B a2 = new A(); 
        
        // DOWN CASTING ---------------------------
        B b2 = (B) a2;

//----------------------------------------------------------------

        b2.show(); // child class

        C c2 = (C) b2;
        c2.show();
    }
}