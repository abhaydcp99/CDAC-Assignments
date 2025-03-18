// Multiple Exception Demo 


//here we need to follow the hierarchy  : 1 object --> 2-- throwable --> 3 -- exception --> 4 --> RuntimeException

class ExceptionDemo9{

    public static void main(String[] args) {
        System.out.println("Start");

        String s1 = "15";
        String s2 = "5";
    
        int i = Integer.parseInt(s1);
        int j = Integer.parseInt(s2);
       
        try {
            int k = i/j;
            System.out.println(k);
        }catch (ArithmeticException e) {                       // here it goes in catch bl;ock pr isko exception nahi mila to ye finally me gaya.
            //e.printStackTrace();
            System.out.println("Arithimetic exception !"); 
        }catch(Exception e){
            System.out.println("exception ");
        }catch (Throwable e) {
            System.out.println("throwable exception");
        }
        finally{
            System.out.println("release the resources !!!");
        }
         System.out.println("Finished");
    }

}

/*Start
3
release the resources !!!
Finished */



/*we can write exception like :
 * (RuntimeException e)
 */