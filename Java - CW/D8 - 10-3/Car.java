// Define the Car class
class Car {
	
	// Main method to test the Car class
    public static void main(String[] args) {
        // Create a Car object with an efficiency of 15 km/liter
        Car myCar = new Car(15);

        // Load gas into the car
        myCar.loadGas(30); // Load 30 liters of gas

        // Drive the car
        myCar.drive(100); // Drive 100 km
        myCar.drive(200); // Try to drive 200 km (may fail if not enough gas)

        // Check gas and odometer
        myCar.checkGas();       // Check how much gas is left
        myCar.checkOdometer(); // Check total kilometers driven
		
    // State/Attributes (Variables to store car information)
    private double gasInTank;   // Liters of gas in the tank
    private double totalKmRun;  // Total kilometers driven so far
    private double efficiency;  // Kilometers per liter (fuel efficiency)

    // Constructor (Special method to initialize the car)
    public Car(double efficiency) {
        this.gasInTank = 0;     // Start with 0 gas in the tank
        this.totalKmRun = 0;    // Start with 0 kilometers driven
        this.efficiency = efficiency; // Set the car's fuel efficiency
    }

    // Behavior: Drive the car
    public void drive(double distance) {
        double gasUsed = distance / this.efficiency; // Calculate gas needed for the distance
        if (gasUsed <= this.gasInTank) { // Check if there's enough gas
            this.gasInTank -= gasUsed;    // Reduce gas in the tank
            this.totalKmRun += distance;  // Add distance to the total kilometers
            System.out.println("Drove " + distance + " km. Gas used: " + gasUsed + " liters.");
        } else {
            System.out.println("Not enough gas to drive " + distance + " km.");
        }
    }

    // Behavior: Load gas into the tank
    public void loadGas(double liters) {
        this.gasInTank += liters; // Add gas to the tank
        System.out.println("Loaded " + liters + " liters of gas. Total gas: " + this.gasInTank + " liters.");
    }

    // Behavior: Check gas in the tank
    public void checkGas() {
        System.out.println("Gas in tank: " + this.gasInTank + " liters.");
    }

    // Behavior: Check odometer (total kilometers driven)
    public void checkOdometer() {
        System.out.println("Total kilometers run: " + this.totalKmRun + " km.");
    }

    
    }
}