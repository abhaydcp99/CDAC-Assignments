class UncheckedDemo {
    static void m3 (){
        System.out.println("4");
        int i = 1/0;  // exception e
    }   
    static void m2(){
        System.out.println("3");

        m3();
    }
    static void m1(){
        System.out.println("2");
        m2();
    }
    static void m(){
        System.out.println("1");
        m1();

    }
    public static void main(String[] args) {
        System.out.println("Started");
        m();
    }    
    
}


/*
 Started
1
2
3
4
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at UncheckedDemo.m3(UncheckedDemo.java:4)
        at UncheckedDemo.m2(UncheckedDemo.java:9)
        at UncheckedDemo.m1(UncheckedDemo.java:13)
        at UncheckedDemo.m(UncheckedDemo.java:17)
        at UncheckedDemo.main(UncheckedDemo.java:22)
)*/