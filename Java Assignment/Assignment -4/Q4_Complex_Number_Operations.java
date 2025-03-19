class ComplexNumber {
    // Data members
    private double real;
    private double imaginary;

    // Default constructor
    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Constructor with real part only
    public ComplexNumber(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    // Constructor with both real and imaginary parts
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(this.real + c.real, this.imaginary + c.imaginary);
    }

    // Method to multiply two complex numbers
    public ComplexNumber multiply(ComplexNumber c) {
        double newReal = (this.real * c.real) - (this.imaginary * c.imaginary);
        double newImaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
        return new ComplexNumber(newReal, newImaginary);
    }

    // Method to display complex number
    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

public class Q4_Complex_Number_Operations {
    public static void main(String[] args) {
        // Creating complex numbers
        ComplexNumber c1 = new ComplexNumber(3, 2);
        ComplexNumber c2 = new ComplexNumber(4, -2);

        // Performing operations
        ComplexNumber sum = c1.add(c2);
        ComplexNumber product = c1.multiply(c2);

        // Displaying results
        System.out.print("Sum: ");
        sum.display();
        System.out.print("Product: ");
        product.display();
    }
}
