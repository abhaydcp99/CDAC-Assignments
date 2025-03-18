class Employee {

        int i;
        String name;

    Employee () {
        this.i= 100;
        this.name="unknown";
		System.out.println("Default");
		System.out.println(i+" "+name);
	}
   
    Employee (int i, String name)	{
        this.i = i;
        this.name=name;
		System.out.println("Parameterized");
		System.out.println(i+" "+name);		
    }
    // copy constructor ----------------------------------------
	
    void data (String name, int i)
    {
       this.i = i; 
       this.name = name;
    }
     
	 static void data1 (String name, int i)
	{
		i =i;
		name = name;
		System.out.println(i+" "+name);
	}
class EmployeeDemo5{
	
    public static void data(String args[]){
		
		Employee e = new Employee();
		e.data("abcd",999);
		
		Employee e1 = new Employee(555,"Abhay");
		Employee.data1("dffd",222);
		
		Employee emp1 = new Employee(e1);
	}
}	
		