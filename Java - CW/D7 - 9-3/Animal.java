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
  
 - Abstract methods can be defined in abstract classes
 -  
 */