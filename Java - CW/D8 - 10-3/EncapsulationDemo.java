/* 
- > Encapsulation :
      - that binds data members and member functions (methods) into single unit,
        where we hiding the internal implementation details and providing controlledd access through public methods.
*/



class Employee{
     // here we create instance variable 

     private int id;
     private String name;
     
// getter method :------------------

     public String getName(){
           return name;
     }
// setter method :------------------------

     public void setName(String name){
        this.name = name;
     }
}

class EncapsulationDemo {
      public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("ISHA");
        System.out.println("Employee name: "+e.getName());
      }    
}
