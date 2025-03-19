import java.util.HashMap;
import java.util.Map;


class HashmapDemo{

    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<Integer, String>();
    
            m.put(101, "Aditya");
            m.put(2, "dhanush");
            m.put(3, "shweta");
            m.put(4, "shweta");
            m.put(4,"shweta");       // not allowed
            m.put(5, "rohan");
            m.put(6,"rohini");
            m.put(115, " ");

            System.out.println(m);
            System.out.println(m.get(2));
            m.remove(3);
            System.out.println(m);
   }
}