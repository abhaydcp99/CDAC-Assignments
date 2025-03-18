class OperatorDemo{
    public static void main (String args[]){
	    int a = 5;
		int b = 10;
		
		// ARITHIMETIC ------------------------------
		
		System.out.println(a+b);
        System.out.println(a-b);		
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		// Relational ------------------------------
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		//System.out.println(a=!b);
		
		
		// Logical ----------------------------------
		
		boolean x = true, y = false;
   		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		
		// Assignment --------------------------------
		
		//System.out.println(x+=5); // ERROR
		System.out.println(a+=5);
		System.out.println(a-=5);
		System.out.println(a*=5);
		System.out.println(a/=5);
		System.out.println(a%=5);
		
// -------------------------------------------------------------------------------------------------------		
		// Bitwise ------------------------------------
		 
		int m = 5, n = 3;
		System.out.println(m & n);
		System.out.println(m | n);
		System.out.println();

        // Bitwise shifting -----------------------------
		
		// LEFT SHIFT ------------------------------------------------------------------
		int num = 5; //                                    binary :  0000 0101
		int result = num << 2;  // leftside by 2                     0001 0100
		System.out.println(num);
		System.out.println(result);
		
		
		// POSITIVE RIGHT SHIFT ----------------------------------------------------------------
		int num1 = 20; //                                    binary :  0000 0101
		int result1 = num >> 2;  // RIGHTSIDE by 2                     0001 0100
		System.out.println(num1);
		System.out.println(result1);
		
     // HERE NUMBER IS NEGATIVE I.E 1 THEN WE HAVE TO FILL IT BY 0 AT BLANK SPACE		
		
		// NEGATIVE RIGHT SHIFT --------------------------------------------------------
		
		int num2 = -20; //                                    binary :  -20 :  1110 1100
		int result2 = num2 >> 2;  // leftside by 2                             1111 1011
		System.out.println(num2);
		System.out.println(result2);
		
        // HERE NUMBER IS NEGATIVE I.E 0 THEN WE HAVE TO FILL IT BY 1 AT BLANK SPACE
    }   
}



// --------------------------------------------------------------

/*
OUTPUT :

15
-5
50
0
5
true
false
false
true
false
false
true
false
10
5
25
5
0
1
7


*/
