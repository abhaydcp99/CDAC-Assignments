class Box {
    // Data members
    private double height;
    private double width;
    private double breadth;

    // Constructor to initialize Box dimensions
    public Box(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    // Method to calculate volume
    public double getVolume() {
        return height * width * breadth;
    }

    // Method to calculate surface area
    public double getArea() {
        return 2 * (height * width + width * breadth + breadth * height);
    }
}

public class Q3_Box_Area_Volume {
    public static void main(String[] args) {
        // Creating instances of Box
        Box box1 = new Box(5, 4, 3);
        Box box2 = new Box(7, 6, 5);

        // Displaying area and volume of each box
        System.out.println("Box 1 - Volume: " + box1.getVolume() + ", Surface Area: " + box1.getArea());
        System.out.println("Box 2 - Volume: " + box2.getVolume() + ", Surface Area: " + box2.getArea());
    }
}
