class AadhaarCard {
    // Step 2: Create a private static instance
    private static AadhaarCard instance;

    // Step 1: Make the constructor private (prevents object creation)
    private AadhaarCard() {
        System.out.println("Aadhaar Card System Initialized");
    }

    // Step 3: Provide a public static method to return the instance
    public static AadhaarCard getInstance() {
        if (instance == null) {
            instance = new AadhaarCard(); // Create instance only if it doesn't exist
        }
        return instance;
    }

    // Method to show Aadhaar details
    public void showDetails() {
        System.out.println("This is a unique Aadhaar Card for a citizen.");
    }
}

// Testing Singleton
class SingletonDemo {
    public static void main(String[] args) {
        // Trying to create multiple instances
        AadhaarCard person1 = AadhaarCard.getInstance();
        AadhaarCard person2 = AadhaarCard.getInstance();

        person1.showDetails();

        // Checking if both instances are the same
        System.out.println("Are both instances the same? " + (person1 == person2));
    }
}


/*Aadhaar Card System Initialized
This is a unique Aadhaar Card for a citizen.
Are both instances the same? true
 */