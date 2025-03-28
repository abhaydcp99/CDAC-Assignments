    
	 import java.util.* ; 


        class Q1
		{
          double Series(int n)
		  {
			if(n==1) 
			{ 
		     return 1 ; 
			}
			 return Series(n-1) +(Math.pow(-1,n+1)/n) ;
            			
		  }

        }			


     class Hw1 
	 {
	     public static void main(String args[])
		 {
		     Scanner sc =  new Scanner(System.in);
			 System.out.println("Enter the number: ");
			 int n = sc.nextInt();
			 
			 
			 Q1 q1= new Q1() ; 
			 
			 double result  = q1.Series(n)  ;
			 
			 System.out.println("Sum of the series : "+result);
	 
	      }
	 
	 }
	 
	 
	 
	 /*
	 
	 if (str.charAt(left) == str.charAt(right)) {
            return true; 
        }
		
		if(str.charAt(left) != str.charAt(right)){
			return false;
		}
		
		return ispalindrome(str, left+1, right-1);
	 
	 
	 */