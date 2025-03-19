import java.util.Scanner;

class ElectricityBill {
    // Data members
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    // Constructor to initialize values
    public ElectricityBill(String customerName, double unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        this.billAmount = 0;
    }

    // Method to calculate bill amount
    public void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            billAmount = (100 * 5) + ((unitsConsumed - 100) * 7);
        } else {
            billAmount = (100 * 5) + (200 * 7) + ((unitsConsumed - 300) * 10);
        }
    }

    // Method to display bill details
    public void displayBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill Amount: Rs." + billAmount);
    }
}

public class Q6_Electricity_Bill_Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter units consumed: ");
        double units = scanner.nextDouble();

        // Creating ElectricityBill object
        ElectricityBill bill = new ElectricityBill(name, units);
        bill.calculateBillAmount();

        // Displaying bill details
        bill.displayBill();
        
        scanner.close();
    }
}
