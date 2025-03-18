abstract class AbstractionEmployee{
    int id;
    String name ;

    AbstractionEmployee(int id, String name){
        this.id = id;
        this.name = name;
    }

    abstract void CalculateSalary();
    final static show(){
        System.out.println("Static method");
    }
    
    void display(){
        System.out.println("Id: "+id+" "+"Name: "+name);
    }
}
// abstract class ------------------

abstract class Animal{
    abstract void sound();    // abstract method : always without implementation
    // we can write normal methods here

    void display(){    // this is non abstract method
        System.out.println("Id : "+id+" "+"Name :"+name);
    }
}


class Dog extends Animal{
    void sound(){
        System.out.println("Printing: Animal sound");
    }
}




/*  :
RULES :

 - can have constructors, static method and final methods
 - used to provide common functionalities to multiple classes
  
 - Abstract methods can be declared in abstract classes
 - If subclass does not implement an abstract method, thenit must be declared abstract
 */
/*
 * 
 REFREENCE :

 1 - Employee e = new Employee();
 2 - Employee e = null;
 3 - Employee e = new childclass();

 - these are the methods by which we can access methods



 // interfaces :
        
 -- it is a blue print of class
 -- by default, all methods in an interface are abstract and public (Java 7)
 
 -- In java 8 :
      -- Default methods ( default keyword ) with implementation.
      -- we can use static methods here also.

 -- In java 9 :
       -- Private methods in interfaces are allowed.
       
       
 SYNTAX :
 
  interface Vehicle {
  void drive ();         /--  its abstract method
  void speed ();         /-- non abstract method
        System.out.println("Speed: Vehicle");
        }
}    
 */