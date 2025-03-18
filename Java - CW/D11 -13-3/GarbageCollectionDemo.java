class Employee{
    String name;
    Employee(String name){
        this.name = name;
    }
}

class GarbageCollectionDemo{

    protected void finalize(){          // this is overriding of method
        System.out.println("Finalize method called ........ ");
    }

    public static void main(String args[]){

        GarbageCollectionDemo g1 = new GarbageCollectionDemo();
        g1 = null;

        System.gc();                    // Request GC
        Runtime.getRuntime().gc();      // this is another method to call GC
    }
}