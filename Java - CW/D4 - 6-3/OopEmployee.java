class OopEmployee{
	
    // instance variable ------------------------------
	private int empId;
	private String empName;
	
	// instance method ---------------------------------
    void set(int id, String name){
	    empId = id;
	    empName = name;
    }
	
    void show()
    {
       System.out.println(empId+" "+empName);
    }
}


// Driver class 

class EmployeeDemo{
    public static void main(String []args){
	    OopEmployee e1 = new OopEmployee();
	
	    e1.set(111, "Abhay");
	    e1.show();
		
		Employee.add(2,3);
        System.out.println(Employee
	}
}	