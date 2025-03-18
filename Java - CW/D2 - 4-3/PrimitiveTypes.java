// 1 - Create a program that declares and initializes all primitive data types in Java and prints their default and assigned values.

public class PrimitiveTypes {
    public static void main(String args[]){
	    
		// integer types ;-------------
		
		byte byteVar = 127;           // 8 bit integer (-128 to 127)
		short shortVar = 32000;      // 16 bit integer (-32,768 to 32,767)
		int intVar = 100000;  // 32 bit integer (-2^31 to 2^31-1)
		long longVar = 100000000000L; // 64 bit integer (-2^63 to 2^63-1) it needs L at suffix
		
		// floating point types ;---------------
		
		float floatVar = 10.5f; // 32 bit floating point, needs f at suffix
		double doubleVar = 99.99; // 64 bit floating point
		
		// character type :------------
		
		char charVar = 'A';  // 16 bit unicode character
		
		// boolean type :--------------
		
		boolean boolVar = true; // true or false
		
		System.out.println("Byte Value: " + byteVar);
		System.out.println("Short Value: " + shortVar);
        System.out.println("Int Value: " + intVar);
		System.out.println("Long Value: " + longVar);
		System.out.println("Float Value: " + floatVar);
		System.out.println("Double Value: " + doubleVar);
		System.out.println("Char Value: " + charVar);
		System.out.println("Boolean Value: " + boolVar);
	}
}	
	
*/
///

Byte Value: 127
Short Value: 32000
Int Value: 100000
Long Value: 100000000000
Float Value: 10.5
Double Value: 99.99
Char Value: A
Boolean Value: true///


///