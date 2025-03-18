class A{}
class B extends A{}
class ExceptionDemo3{
    public static void main (String args[]){
        System.out.println("Started");
        A a = new A();
        try {
            B b = (B)a;         // Downcasting : exception
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());                                            // this gives an actuall reasson of why exception is occured
            e.printStackTrace();
            System.out.println("Downcast me issue hai !!!");
        }
        System.out.println("Finished");
    }

}
