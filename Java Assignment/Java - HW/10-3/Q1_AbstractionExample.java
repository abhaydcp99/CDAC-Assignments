// Step 1: Create an abstract class 'Bank'
abstract class Bank {
    // Abstract method (no implementation here)
    abstract void loanInterestRate();

    // Concrete method (has implementation)
    void displayBankDetails() {
        System.out.println("Welcome to the Bank!");
    }
}
//adede new ccommrnt here
// Step 2: Create a subclass 'SBI' that extends 'Bank'
/*The SBI class inherits from Bank and must provide an implementation for the loanInterestRate() method. */
class SBI extends Bank {
    // Implement the abstract method
    //SBI provides its own implementation of the loanInterestRate() method.

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

class ICICI extends Bank{
    void loanInterestRate(){
        System.out.println("ICICI Loan intrest rate: 100% per annum");
    }
}
// CREATING OBJECTS :-------------------------

// Step 4: Main class to test abstraction
public class Q1_AbstractionExample {
    public static void main(String[] args) {
        // Creating object of SBI using reference of Bank
        Bank sbiBank = new SBI();
        sbiBank.displayBankDetails();  // Calling concrete method -- WELCOME TO BANK
        sbiBank.loanInterestRate();    // Calling implemented method -- SBI LOAN INTREST RATE

        // Creating object of HDFC using reference of Bank
        Bank hdfcBank = new HDFC();
        hdfcBank.displayBankDetails(); // Calling concrete method
        hdfcBank.loanInterestRate();   // Calling implemented method
    
        Bank ICICIBank = new ICICI();
        ICICIBank.displayBankDetails();
        ICICIBank.loanInterestRate();
    
    }
}

/*Key Takeaways
1- Abstraction hides details – The user only knows the loanInterestRate() method exists but doesn’t see its implementation.
2- Abstract classes cannot be instantiated – You must create a subclass and implement the abstract methods.
3- Dynamic method dispatch is used – We reference objects using the parent Bank class, but execution depends on the actual subclass (SBI or HDFC).
4- Abstraction increases flexibility – If a new bank (e.g., ICICI) is added, we just extend Bank and implement loanInterestRate(), without changing existing code. */