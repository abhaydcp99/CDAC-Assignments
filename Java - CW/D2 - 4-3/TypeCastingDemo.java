public class TypeCastingDemo {
    public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int intValue = 100;
        double doubleValue = intValue; // int -> double (automatic conversion)

        System.out.println("Implicit Type Casting:");
        System.out.println("Integer Value: " + intValue);
        System.out.println("Converted Double Value: " + doubleValue);

        // Explicit Type Casting (Narrowing)
        double anotherDouble = 99.99;
        int anotherInt = (int) anotherDouble; // double -> int (manual conversion)

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Original Double Value: " + anotherDouble);
        System.out.println("Converted Integer Value: " + anotherInt);
        System.out.println("Data Loss: The decimal part (.99) is lost during conversion.");
    }
}




/*
Implicit Type Casting:
Integer Value: 100
Converted Double Value: 100.0
*/

/*
Explicit Type Casting:
Original Double Value: 99.99
Converted Integer Value: 99
Data Loss: The decimal part (.99) is lost during conversion.
/*