import java.util.*;

public class Hw5 {


    public static char  rev(String s , int l )
	{
          if(l == 0)
			return s.charAt(0) ; 
		
		  System.out.print(  s.charAt(l-1) ) ;
         return rev(s , --l) ; 

    }		
   
  

    public static void main(String[] args) 
	{
     
	 Scanner sc = new Scanner(System.in) ; 
        
		String a = sc.nextLine() ; 
		
		int l = a.length() ; 
		
       rev(a , l ) ;
	 
    }
}