
// ex without @override keyword -------

class Parent{         // parent class / super class
    void display(){
        System.out.println("Display()::Parent class");
    }

}

class Child extends Parent{

    void display(){              // its method overriding
        System.out.println("Display()::Child class");
    }
}
 
// iske pass do display methods hai 

class OverridingDemo1 {
    public static void main(String[] args) {
       
        Child c1 = new Child();
        c1.display();
        // Display()::Child class

        Parent p1 = new Parent();
        p1.display();
        // Display()::Parent class

        Parent p2 = new Child();
        p2.display();
        // Display()::Child class 

    }
}
