  
  class Example{
    void modify(Wrapper w){
	w.num = 20; //value is updated
	System.out.println(w.num); // 20
	}
  }
   
  class ExampleDemo2{
    int num; // 10

    Wrapper(int num, String name){
        this.num = num;
        this.name = name;
 	}
   }
   
    class ExampleDemo2{
        public static void main(String args[]){		
		         
				 Wrapper w = new Wrapper(10);
				 Example e = new Example();
				 e.modify(w); // 20
				 
				 System.out.println(w.num);//20
		}
	}		