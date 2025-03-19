import java.util.Scanner;

class BMICalculator {
    // Data members
    private double height;
    private double weight;

    // Parameterized constructor
    public BMICalculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    // Setter methods
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Getter methods
    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // Method to calculate BMI
    public double calculateBMI() {
        return weight / (height * height);
    }
}

public class Q5_BMI_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();
        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Creating BMICalculator object
        BMICalculator bmiCalculator = new BMICalculator(height, weight);

        // Calculating and displaying BMI
        System.out.println("Your BMI is: " + bmiCalculator.calculateBMI());
        
        scanner.close();
    }
}
