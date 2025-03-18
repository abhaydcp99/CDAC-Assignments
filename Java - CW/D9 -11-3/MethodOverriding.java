// Parent class: Vehicle
class Vehicle {
    void move() {
        System.out.println("The vehicle is moving.");
    }
}

// Subclass: Car (Overrides move method)
class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("The car moves on roads.");
    }
}

// Subclass: Boat (Overrides move method)
class Boat extends Vehicle {
    @Override
    void move() {
        System.out.println("The boat moves on water.");
    }
}

// Subclass: Plane (Overrides move method)
class Plane extends Vehicle {
    @Override
    void move() {
        System.out.println("The plane flies in the sky.");
    }
}

// Main class
public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle myVehicle; // Parent class reference
        
        // Creating different objects and assigning to Vehicle reference
        myVehicle = new Car();
        myVehicle.move(); // Calls Car's move method

        myVehicle = new Boat();
        myVehicle.move(); // Calls Boat's move method

        myVehicle = new Plane();
        myVehicle.move(); // Calls Plane's move method
    }
}


/*
 
Feature	                     Method Overloading	                                                           Method Overriding
                
Definition      --	  Multiple methods with the same name but different parameters in the same class.      	 A method in the child class redefines a method from the parent class.
Execution Time	--     Compile-time polymorphism (method is selected at compile-time).	                     Runtime polymorphism (method is selected at runtime).
Number of Classes --	Happens in the same class.	                                                      Happens in parent-child classes (Inheritance).
Method Signature    --    	Must be different (different parameters).	                                        Must be same as the parent class method.
Keyword Used	--             No special keyword.                                                                   	Uses @Override annotation.
 */