
import java.util.HashMap;

class LinkHashMapDemo3 {
    public static void main(String args[]){
        Map<Integer , String> m = new LinkedHashMap<Integer, String>();
    
    // <key, values>

    m.put(101, "Aditya");
    m.put(2, "dhanush");
    m.put(3, "shweta");
    m.put(4, "shweta");      
    m.put(5, "rohan");
    m.put(6,"rohini");
    m.put(7, " ");
    m.put(8, " ");
    m.put(9, " ");

    System.out.println(m);
    System.out.println(m.get(5));
    m.remove(3);
    System.out.println(m);   
   }
}