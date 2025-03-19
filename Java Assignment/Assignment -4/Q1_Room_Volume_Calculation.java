class Room {
    // Data members
    private double height;
    private double width;
    private double breadth;

    // Constructor to initialize the room dimensions
    public Room(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    // Method to calculate volume
    public double volume() {
        return height * width * breadth;
    }
}

public class Q1_Room_Volume_Calculation {
    public static void main(String[] args) {
        // Creating instances of Room
        Room room1 = new Room(10, 12, 15);
        Room room2 = new Room(8, 10, 12);

        // Displaying the volume of each room
        System.out.println("Volume of Room 1: " + room1.volume());
        System.out.println("Volume of Room 2: " + room2.volume());
    }
}
