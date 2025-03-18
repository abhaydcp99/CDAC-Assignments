// 


// Step 1: Create an abstract class 'Bank'
abstract class Bank {
    // Abstract method (no implementation here)
    abstract void loanInterestRate();

    // Concrete method (has implementation)
    void displayBankDetails() {
        System.out.println("Welcome to the Bank!");
    }
}

// Step 2: Create a subclass 'SBI' that extends 'Bank'
class SBI extends Bank {
    // Implement the abstract method
    void loanInterestRate() {
        System.out.println("SBI Loan Interest Rate: 7.5% per annum");
    }
}

// Step 3: Create another subclass 'HDFC' that extends 'Bank'
class HDFC extends Bank {
    // Implement the abstract method
    void loanInterestRate() {
        System.out.println("HDFC Loan Interest Rate: 8.2% per annum");
    }
}

// Step 4: Main class to test abstraction
public class Q1_AbstractionExample {
    public static void main(String[] args) {
        // Creating object of SBI using reference of Bank
        Bank sbiBank = new SBI();
        sbiBank.displayBankDetails();  // Calling concrete method
        sbiBank.loanInterestRate();    // Calling implemented method

        // Creating object of HDFC using reference of Bank
        Bank hdfcBank = new HDFC();
        hdfcBank.displayBankDetails(); // Calling concrete method
        hdfcBank.loanInterestRate();   // Calling implemented method
    }
}
