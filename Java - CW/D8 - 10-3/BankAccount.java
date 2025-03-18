// Class representing a Bank Account
class BankAccount {
    // State / Attributes
    private double balance; // Account balance

    // Constructor to initialize account with an optional balance
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Behavior / Methods
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500); // Create account with initial balance of 500
        myAccount.checkBalance();
        myAccount.deposit(200);
        myAccount.withdraw(100);
        myAccount.withdraw(700); // Trying to withdraw more than balance
    }
}
