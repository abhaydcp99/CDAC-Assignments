
class Animal{
    void show(){
        System.out.println("Parent class");
    }
}

class Cat extends Animal{
    void show(){
        System.out.println("Child class");
    }
}




class DownCasting {
    public static void main(String[] args) {
        

// CASE 1 :---------------------------

        Animal a = new Cat(); // upcasting
        Cat c = (Cat) a; // downcasting
        c.show(); // child method

// CASE 2 : -------------------------------
        //  -- exception error 
           
      /*  Animal a1 = new Animal();
          Cat c1 = (Cat) a1;
          c1.show(); */

// CASE 3 : --------------------------------

        Animal a2 = new Cat(); // upcasting

        if (a2 instanceof Cat) {
              Cat c2 = (Cat) a2;
              c2.show(); // child method                         
        }else{
            System.out.println("Downcasting :: Not possible !!");
        }

// CASE 4 : ---------------------------------------------------
           
          Animal a3 = new Animal();       // here child class visibility nahi hai
          if (a3 instanceof Cat) {
            Cat c3 = (Cat) a3;
            c3.show();
          }else{
            System.out.println("Downcasting :: not possible");
          }                               // Downcasting :: not possible

    }
}
