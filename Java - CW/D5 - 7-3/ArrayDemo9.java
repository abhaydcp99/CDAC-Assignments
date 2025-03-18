class Student{
    int id;
    String name;
	
	// set value for name instance variable
	// constructor : parameterized construction
	
	Student(int id,String name){
		this.id = id;
	    this.name = name; // instance variable = parameter
	}
}

class ArrayDemo9{
	
    public static void main(String[]args){
		Student[] s1 = new Student[3];  // this is the declaration of array of the object
	    s1 [0] = new Student(111,"Abhay"); 
	    s1 [1] = new Student(222,"diya");  
	    s1 [2] = new Student(333,"aditi");  

        for (Student s : s1){
	        System.out.println(s.id+" "+s.name);	
	    }
		//System.out.println();	
	    //System.out.println();	
	}
	
}	