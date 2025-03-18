// ex with @override keyword -------

class Parent{         // parent class / super class
    protected void display(){
        System.out.println("Display()::Parent class");
    }

}

class Child extends Parent{
    @Override
    // we can put here protected or public before void
    public void display(){              // its method overriding
        // default : error : accesss nodifier control
        System.out.println("Display()::Child class");
    }
}
 
// qki iske pass do display methods hai 

class OverridingDemo2 {
    public static void main(String[] args) {
       
      Child c = new Child();
      c.display();

    }
}
 
