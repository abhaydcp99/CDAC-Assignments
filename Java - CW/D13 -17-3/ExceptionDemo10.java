
class ExceptionDemo10{
    void m1(){
        System.out.println("M1 :: Started");
    }
    public static void main(String[] args) {
        System.out.println("Started !!");

        ExceptionDemo10 a = null;

        try {
            a.m1(); // throw null pointer exception e
                    // throw new runtime exception e
                    //throw new exception e
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null ko invoke mat karo!!!");
        }
        System.out.println("Finshed!!!");

        

    }
}   


/*Started !!
java.lang.NullPointerException: Cannot invoke "ExceptionDemo10.m1()" because "<local1>" is null
        at ExceptionDemo10.main(ExceptionDemo10.java:12)      
Null ko invoke mat karo!!!
Finshed!!! */