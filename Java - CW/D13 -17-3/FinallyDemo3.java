class FinallyDemo3 {

    void m1(){
        System.out.println("M1 :: Started");
    }
     public static void main(String[] args) {
         System.out.println("Started");

         FinallyDemo3 a = null;
        try{
             a.m1(); // Exception e :: NPE
            }finally{
                System.out.println("Release RESOURCES !!!");
             }
             System.out.println("Finished");
    
         }    
    }


    /*
     * Started
Release RESOURCES !!!
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "FinallyDemo3.m1()" because "<local1>" is null     
        at FinallyDemo3.main(FinallyDemo3.java:11)
     */