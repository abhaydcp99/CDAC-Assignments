import java.util.* ; 

public class introduction {

     static boolean isPrime(int n)
	 {
		  boolean b =  true  ;
			
			if(n< 2)
				
			{
				return false ;
				
			}
	           
	        for(int i = 2 ; i<n ; i++)
	        {
	        	
	        	if(n % i == 0 )
	        	{
					return  false  ;
	        	  // System.out.println("Not a prime !");
	        	}
	        	
	        	
	        }
      		 return true ;


		 
	 }



	public static void main(String[] args) {
		
        
		 Scanner sc  =  new Scanner(System.in);
	        
	        int n  = sc.nextInt();

	       
                if(isPrime(n) == true )
				 {
				  System.out.println("prime !");	
				 }
				 else{
					System.out.println("not prime !");
				}
			 
				sc.close();
	         
		
			}
}
