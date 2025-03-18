public class WrapperClassConversion {
    public static void main(String[] args) {
        // Convert Integer to Double using Wrapper Class
        Integer intValue = 50; // Integer object
        Double doubleValue = intValue.doubleValue(); // Convert Integer to Double

        System.out.println("Integer to Double Conversion:");
        System.out.println("Integer Value: " + intValue);
        System.out.println("Converted Double Value: " + doubleValue);

        // Convert Double to Integer using Wrapper Class
        Double anotherDouble = 99.99; // Double object
        Integer anotherInt = anotherDouble.intValue(); // Convert Double to Integer

        System.out.println("\nDouble to Integer Conversion:");
        System.out.println("Original Double Value: " + anotherDouble);
        System.out.println("Converted Integer Value: " + anotherInt);
        System.out.println("Data Loss: The decimal part (.99) is lost during conversion.");
    }
}


/*
Integer to Double Conversion:
Integer Value: 50
Converted Double Value: 50.0

Double to Integer Conversion:
Original Double Value: 99.99
Converted Integer Value: 99
Data Loss: The decimal part (.99) is lost during conversion.


*/
