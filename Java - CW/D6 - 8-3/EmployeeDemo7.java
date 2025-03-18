class Employee{
       int i;
	   int age;
	   String name;
	   
	   // constructor overloading -----------------------------
	    Employee(){
	        System.out.println(i+name);
		}
		
		// parameter 1 ---------------------------
		Employee(int i, String name){
			this.i = i;
			this.name = name;
			System.out.println(i+name);
	    }
		
		// parameter 2----------------------------
        Employee(int i, String name){
			this.i = i;
			this.name = name;
			System.out.println(i+name+age);
	    }	
        
        // parameter 3------------------------------		
        Employee(int i, String name){
			this.i = i;
			this.name = name;
			System.out.println(i+name+age);
	    }
		
    class EmployeeDemo7{
        public static void main(String args[]){
            Employee e = new Employee();
        }
    }		