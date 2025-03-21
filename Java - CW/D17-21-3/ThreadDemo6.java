
// Execution of join () :: To take the controll of execution 



class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " : " + Thread.currentThread().getName());
        }
    }
}



public class ThreadDemo6 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"started");
       
        MyThread1 t1 = new MyThread1();t1.setName("T1");
        MyThread1 t2 = new MyThread1();t2.setName("T2");
        MyThread1 t3 = new MyThread1();t3.setName("T3");
        MyThread1 t4 = new MyThread1();t4.setName("T4");

        t1.start();
        t2.start();
        t3.start();


        // join() :: ensures t3 thread complete before t4
        
        try {
            t3.join();                       // throws exception
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t4.start();

        System.out.println(Thread.currentThread().getName()+"finished");
    }
    
}


/*
 mainstarted
0 : T2
1 : T2
0 : T1
0 : T3
1 : T3
2 : T2
3 : T2
1 : T1
2 : T1
2 : T3
3 : T3
4 : T2
3 : T1
4 : T1
4 : T3
mainfinished
0 : T4
1 : T4
2 : T4
3 : T4
4 : T4
 */