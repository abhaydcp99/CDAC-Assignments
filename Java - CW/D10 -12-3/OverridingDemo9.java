class GrandParent{
      GrandParent(){
        System.out.println("Grand Parent");
      }
}



class Parent extends GrandParent{
    Parent(){
        //super(); // calls GrandParent
        System.out.println("Parent Constructor");
    }
}



class Child extends Parent{

    Child(){
        //super();   //  call parent constructor
        System.out.println("Child Constructor");
    }
}


class OverridingDemo9{
       public static void main(String[] args) {
        
        Child c = new Child();
        
    
       }    
}


// super is optional !!!!!!!!!

// hw : child : 2 constructors: default, parameterized + constructor chaining