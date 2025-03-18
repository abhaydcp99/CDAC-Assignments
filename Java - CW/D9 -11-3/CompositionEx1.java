
// ----------------------------------------- class 1
class Engine{             
    String type;

    Engine(String type){        // constructor
        this.type = type;       
    }

}
// ----------------------------------------- class 2 
class Car{
     String model;
     Engine e;                // composition (it is STRONG HAS-A relationship)

// -------------------------------------------------------

     Car(String model, String type)
    {
        this.model = model;
        this.e = new Engine (type);   // creating an object inside the construct bcz hum directly nahi pahonch pa rahe the object tak
    }
// --------------------------------------------------------
    void display()
    {
        System.out.println(model+" "+e.type);
    }
}

// ---------------------------------------------------------------------

class CompositionEx1 {
      public static void main(String[] args) {
        Car c1 = new Car("toyota", "SUV");
        c1.display();
      }    
}






// COMPOSITION  : Engine e 