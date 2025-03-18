// here :: 

class ExceptionDemo11{

    public static void main(String[] args) {
        System.out.println("Started !!");

        try {
            throw  new NullPointerException();

        } catch (NullPointerException e) {
            e.printStackTrace();                               // prints :: java.lang.NullPointerException
            System.out.println("Null ko invoke mat karo!!!");
        }finally{
            System.out.println("Finallyyyyyyy!!!!");
        }
        System.out.println("Finshed!!!");
      
        

    }
}


/*Started !!
java.lang.NullPointerException
        at ExceptionDemo11.main(ExceptionDemo11.java:9)
Null ko invoke mat karo!!!
Finallyyyyyyy!!!!
Finshed!!! */