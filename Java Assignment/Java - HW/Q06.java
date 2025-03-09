// Write a program to display character and string literals along with their ASCII values.


public class Q06 {
      public static void main(String[] args) {
        for(int i = 97; i<123; i++){                       // This is a for loop that initializes i with the value 97 The loop runs as long as i < 123, incrementing i by 1 in each iteration.
            System.out.println(i + " " +(char)i + " ");
        } 
        System.out.println();

        String s = "hello world!!";
        System.out.println(s);
        for(int i = 0; i<s.length(); i++){
            System.out.print((int)(s.charAt((i))));
        }
        System.out.println();     // for printing new line

        String p = "namste india!!";
        System.out.println(p);
        for(int i = 0; i<p.length(); i++){
            System.out.print((int)(p.charAt((i))));
        }
        
      }    
}

/*
 97 a 
98 b 
99 c 
...
122 z 

hello world
104 101 108 108 111 32 119 111 114 108 100 

 */