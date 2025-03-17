/*Ques.3
Java Coding Question (20 Marks)
Implement Runtime Polymorphism in Java using a BMW vehicle hierarchy. Create a parent class BMW with two methods: showDetails(), which prints "This is a BMW vehicle.", and maxSpeed(), which prints "Speed varies by model.".

Extend this class into three subclasses: BMWSeries3, BMWSeries5, and BMWSeries7, each overriding the methods to display their respective series names and max speeds (240 km/h, 260 km/h, and 300 km/h).

In the main method, create an array of BMW references, assign subclass objects, and use a loop to call showDetails() and maxSpeed(). The program should demonstrate method overriding, runtime polymorphism, and dynamic method dispatch. */






// Parent class BMW
class BMW {
    // Method to display BMW details
    void showDetails() {
        System.out.println("This is a BMW vehicle.");
    }

    // Method to display max speed
    void maxSpeed() {
        System.out.println("Speed varies by model.");
    }
}

// Subclass BMWSeries3 extending BMW
class BMWSeries3 extends BMW {
    @Override
    void showDetails() {
        System.out.println("This is BMW Series 3.");
    }

    @Override
    void maxSpeed() {
        System.out.println("Max speed: 240 km/h");
    }
}

// Subclass BMWSeries5 extending BMW
class BMWSeries5 extends BMW {
    @Override
    void showDetails() {
        System.out.println("This is BMW Series 5.");
    }

    @Override
    void maxSpeed() {
        System.out.println("Max speed: 260 km/h");
    }
}

// Subclass BMWSeries7 extending BMW
class BMWSeries7 extends BMW {
    @Override
    void showDetails() {
        System.out.println("This is BMW Series 7.");
    }

    @Override
    void maxSpeed() {
        System.out.println("Max speed: 300 km/h");
    }
}

// Test class with main method
public class Q3_BMWDemo {
    public static void main(String[] args) {
        // Creating an array of BMW references with different subclass objects
        BMW[] bmwCars = {new BMWSeries3(), new BMWSeries5(), new BMWSeries7()};

        // Looping through the array to demonstrate runtime polymorphism
        for (BMW car : bmwCars) {
            car.showDetails();
            car.maxSpeed();
            System.out.println();
        }
    }
}

/*
This is BMW Series 3.
Max speed: 240 km/h  

This is BMW Series 5.
Max speed: 260 km/h  

This is BMW Series 7.
Max speed: 300 km/h  */