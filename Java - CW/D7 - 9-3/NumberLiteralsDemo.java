//5. Write a program to demonstrate binary, octal, hexadecimal, and floating-point literals in Java.

public class NumberLiteralsDemo {
    public static void main(String[] args) {
        // Binary Literal (prefix 0b)
        int binaryNum = 0b1010; // 10 in decimal

        // Octal Literal (prefix 0)
        int octalNum = 012; // 10 in decimal

        // Hexadecimal Literal (prefix 0x)
        int hexNum = 0xA; // 10 in decimal

        // Floating-Point Literals
        double doubleNum = 10.5;
        float floatNum = 12.34f; // 'f' is needed for float literals

        // Display values
        System.out.println("Binary (0b1010)   : " + binaryNum);
        System.out.println("Octal (012)       : " + octalNum);
        System.out.println("Hexadecimal (0xA) : " + hexNum);
        System.out.println("Double (10.5)     : " + doubleNum);
        System.out.println("Float (12.34f)    : " + floatNum);
    }
}
