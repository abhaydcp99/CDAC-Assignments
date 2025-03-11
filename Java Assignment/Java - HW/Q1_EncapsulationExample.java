// Step 1: Create an encapsulated class
class MobilePhone {
    // Private data members (hidden DATA from outside --- ANYONE CANT SEE THIS)
    private String brand;
    private int volumeLevel;

    // Constructor to initialize values
    public MobilePhone(String brand) {
        this.brand = brand;
        this.volumeLevel = 5; // Default volume level
    }

    // Getter method : ALLOWS to access the private variable 'brand'
    public String getBrand() {
        return brand;
    }

    // Setter method : ALLOWS to modify the private variable 'brand'
    public void setBrand(String brand) {
        this.brand = brand;
    }

// Step 2: Implementing Data Control (Volume Level)

    // Getter method for volume level
    public int getVolumeLevel() {
        return volumeLevel;
    }

    // Setter method to change the volume safely
    public void setVolumeLevel(int level) {
        if (level >= 0 && level <= 10) {   // If the input is between 0 and 10, it updates the volume.

            this.volumeLevel = level;
            System.out.println("Volume set to: " + level);
        } else {
            System.out.println("Invalid volume level! Please set between 0 and 10.");
        }          // Otherwise, it prints an error message.
    }
}

// Step 3: Create a main class to test Encapsulation
public class Q1_EncapsulationExample {
    public static void main(String[] args) {
        // Creating an object of MobilePhone
        MobilePhone phone = new MobilePhone("Samsung");

        // Accessing data using getter methods
        System.out.println("Phone Brand: " + phone.getBrand());

        // Modifying data using setter methods
        phone.setVolumeLevel(7);  // Valid change
        phone.setVolumeLevel(15); // Invalid change

        // Accessing modified data
        System.out.println("Current Volume: " + phone.getVolumeLevel());
    }
}

/*Key Takeaways
1- Encapsulation hides data – Variables are declared private, preventing direct access.
2- Controlled access using getters and setters – We use getter methods to read values and setter methods to modify them safely.
3- Data validation – We can add conditions in setter methods to ensure valid data input.
4 -Better maintainability – If we need to change how volumeLevel works, we only modify setter methods, without affecting other parts of the program. */