

class Example{
     int num;
	 
	 Example(int num){
	    this.num = num;
	 }
	 
}

    class ExampleDemo3{
        public static void main(String args[]){
                
            Example e1 = new Example(10);
			Example e2 = new Example(20);
			
			e1 = e2;
			Example e3 = new Example(30);
			
	        e2 = e3;
			
			Example e4 = null;
		}
	}		