class Employee{
    int id;
    String name;
    Address a;    // HAS-A relationship with address class


      Employee (int id, String name, Address a)
       {
         this.id = id;
         this.name = name;
         this.a = a;
        }

      void display()
        {
         System.out.println(id+" "+name);
         System.out.println();
        }
}
class Address{
    String city, state, country;

        Address(String city, String state, String country)
        {
            this.city =city;
            this.state=state;
            this.country=country;
        }
}

public class AggregationEx1 {
    public static void main(String args[]) {
        // Creating Address object
        Address a1 = new Address("Pune", "Maharashtra", "India");
        
        // Creating Employee object and linking it with Address (Aggregation)
        Employee e1 = new Employee(11, "Abhay", a1);
        
        // Displaying Employee details
        e1.display();
    }
}
