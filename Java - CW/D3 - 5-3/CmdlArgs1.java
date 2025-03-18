
class CmdlArgs1{
   public static void main(String args[]){
        int i = 10; // compile time
		// user input : input required at run time
		
		String s1 = args[0];
		String s2 = args[1];
		System.out.println(s1);
		System.out.println(s2);
		
		// WRAPPER CLASSESS  : int = Integer , float = Float
		
		int m = Integer.parseInt(s1); // 10
		int n = Integer.parseInt(s2); 
	    System.out.println(s1+s2);
		System.out.println(m+n);
		



	}
}