import java.io.*;


class A{
    void m1() throws Exception{

    }
}

class B extends  A{

    void m1() throws Exception, FileNotFoundException, ArrayIndexOutOfBoundsException{
    }
}

class CheckedDemo9 {
    public static void main (String args[]) throws FileNotFoundException, Exception {
       A a = new A();
       a.m1();
   }
}