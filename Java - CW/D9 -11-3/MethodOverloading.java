// Class representing an ATM Machine

class ATM {
    
    // Method to withdraw using a Debit Card
    void withdraw(int amount) {
        System.out.println("Withdrawn ₹" + amount + " using Debit Card.");
    }

    // Method to withdraw using a Credit Card
    void withdraw(int amount, String cardType) {
        System.out.println("Withdrawn ₹" + amount + " using " + cardType + " Credit Card.");
    }

    // Method to withdraw using Mobile Banking
    void withdraw(String app, int amount) {
        System.out.println("Withdrawn ₹" + amount + " using " + app + " mobile banking.");
    }
}

// Main class
public class MethodOverloading {
    public static void main(String[] args) {
        // Creating an ATM object
        ATM myATM = new ATM();
        
        // Calling different withdraw methods (Method Overloading)
        myATM.withdraw(5000);                      // Calls the first method
        myATM.withdraw(7000, "Visa");              // Calls the second method
        myATM.withdraw("Google Pay", 3000);        // Calls the third method
    }
}
 
/*
 
Feature	                     Method Overloading	                                                           Method Overriding
                
Definition      --	  Multiple methods with the same name but different parameters in the same class.      	 A method in the child class redefines a method from the parent class.
Execution Time	--     Compile-time polymorphism (method is selected at compile-time).	                     Runtime polymorphism (method is selected at runtime).
Number of Classes --	Happens in the same class.	                                                      Happens in parent-child classes (Inheritance).
Method Signature    --    	Must be different (different parameters).	                                        Must be same as the parent class method.
Keyword Used	--             No special keyword.                                                                   	Uses @Override annotation.
 */


// return type overloading :---------------


// method name + parameters:=> overloading
// return type ka isme koi role nahi hai....



// Type promotion :
/*
 add(int, int long) => long
 add(int, long, int) => long
 
 int -> long -> float -> double

 TYPE PROMOTION AMBIGUITY:

  add(int a, long b){}

  add (long x, int y){
  }       
   --- call
  add(3, 7l);
 */


/*

OVERLOADING THE MAIN METHOD():

class A{
      public static void main(String args[]) {}
      
      public static void main(String args) {}
      
      public void static main(String x[]) {}
      
      public void static main() {}

}



*/ 
 