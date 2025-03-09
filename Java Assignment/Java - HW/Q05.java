// Write a program to demonstrate binary, octal, hexadecimal, and floating-point literals in Java.

public class Q05 {
    public static void main(String[] args) {
        int q = 0b1010;   // binary representation (0b prefix) : int a = 0b1010;  // Binary 1010 → Decimal equivalent: 10
                          // Binary numbers use only 0 and 1. --   0b1010 means (1×2³) + (0×2²) + (1×2¹) + (0×2⁰) = 8 + 0 + 2 + 0 = 10.               

        int x = 020;      // octal representation (0 prefix) : int x = 020;  // Octal 020 → Decimal equivalent: 16
                          // Octal numbers use digits 0-7 only. --  020 means (2×8¹) + (0×8⁰) = 16 + 0 = 16.

        int y = 52;       // decimal number 

        int z = 0x01f1; // Hexadecimal numbers use digits 0-9 and letters A-F (where A=10, B=11, ..., F=15).
                        // 0x01F1 means (1×256) + (15×16) + (1×1) = 256 + 240 + 1 = 497.


        System.err.println(q+ " "+ x +" "+ y+ " "+ z);

        float f = 123.95f; // 32 bit :floating point number
                           // float stores decimal numbers but has less precision than double (only about 6-7 significant digits).

        double d = 123456.7890123456; // 64 bit double precision floating point number
                                    // double provides higher precision than float (about 15-16 significant digits).

        System.err.println(f+ " "+ d); // System.err.println() prints to standard error. 
    }
}


/*
 10 16 52 497
123.95 123456.7890123456
 */