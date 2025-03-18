class Employee{
    float salary = 40000; // parent class
}

class Programmer extends Employee{
    int bonus = 10000;   // child class
}

class SingleInheritance {
      public static void main(String[] args) {
        
        Employee e = new Programmer();
        System.out.println("Sal = ");
      }    
}






/*
 TYPES :

 1- SINGLE INHERITANCE
 2- MULTILEVEL INHERITANCE
 3- HIRERCHICHAL INHERITANCE
 
 4- MULTIPLE 
 5- HYBRID 
 */