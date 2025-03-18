
class StaticDemo{
    
		static int x = 10; // static
		static int y = 20; // static
		int z = 30; // instance
		
		void show(){
			x = 60;                    // it can change value of all X FROM 10 TO 60
		   System.out.println(x);
		   System.out.println(z);
		}
		static void show1 (){
			
			System.out.println(x); // ok
            //System.out.println(z); //  error : static variable ko static hi chahiye			
	}
	public static void main(String [] args){
		
		StaticDemo s1 = new StaticDemo();
		s1.show();
		// show(); ----- error : instance method require refrence object
		
		show1(); // no need refrence
		StaticDemo.show1();
    }
}	
