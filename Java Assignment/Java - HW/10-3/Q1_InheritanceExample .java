// Step 1: Create a Parent Class (Superclass)
class Vehicle {
    String brand;
    int speed;

    // Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Common method for all vehicles
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Step 2: Create a Child Class (Subclass)
class Car extends Vehicle {
    int numberOfSeats;

    // Constructor
    public Car(String brand, int speed, int numberOfSeats) {
        // Call the parent class constructor using 'super'
        super(brand, speed);
        this.numberOfSeats = numberOfSeats;
    }

    // Additional method specific to Car
    void showCarDetails() {
        displayInfo(); // Calling parent class method
        System.out.println("Number of Seats: " + numberOfSeats);
    }
}

// Step 3: Create Another Child Class
class Bike extends Vehicle {
    String type;

    // Constructor
    public Bike(String brand, int speed, String type) {
        // Call the parent class constructor using 'super'
        super(brand, speed);
        this.type = type;
    }

    // Additional method specific to Bike
    void showBikeDetails() {
        displayInfo(); // Calling parent class method
        System.out.println("Bike Type: " + type);
    }
}

// Step 4: Main Class to Test Inheritance
public class Q1_InheritanceExample {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Toyota", 180, 5);
        System.out.println("Car Details:");
        myCar.showCarDetails();

        // Creating a Bike object
        Bike myBike = new Bike("Yamaha", 120, "Sports");
        System.out.println("\nBike Details:");
        myBike.showBikeDetails();
    }
}


/*Key Takeaways
1- Code Reusability – The Car and Bike classes reuse properties and methods from Vehicle, reducing redundancy.
2- Extensibility – If we add another vehicle (e.g., Truck), we only extend Vehicle instead of rewriting common properties.
3- Super Keyword (super()) – It is used to call parent class constructors or methods from a subclass.
4- Inheritance Hierarchy – Vehicle is the parent class, and Car & Bike are child classes.
 */

/*Real-Life Analogy
1- A parent-child relationship: A child inherits genes (properties) from parents but also has unique characteristics.
2- In Java, a child class (Car, Bike) inherits from parent class (Vehicle) and can add new features. */ 