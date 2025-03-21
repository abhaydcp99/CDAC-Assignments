// runnable interface :
// common running method


class MyRun implements Runnable{

    @Override
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(i+" : "+Thread.currentThread().getName());
        }
    }
}


public class ThreadDemo2 {
          public static void main(String[] args) {
              MyRun r1 = new MyRun();

              Thread t1 = new Thread(r1,"T1");          // we have make use class of thread comstructor here
              Thread t2 = new Thread(r1,"T2");          // we have make use class of thread comstructor here
              Thread t3 = new Thread(r1,"T3");          // we have make use class of thread comstructor here
              Thread t4 = new Thread(r1,"T4");          // we have make use class of thread comstructor here
          
              t1.start();
              t2.start();
              t3.start();
              t4.start();
            } 
}


// to run Thread.t2 we have start it : t2.start


/*
 output ::     
0 : T2
1 : T2
2 : T2
0 : T1
1 : T1
2 : T1
0 : T3
1 : T3
0 : T4
3 : T2
4 : T2
3 : T1
2 : T3
3 : T3
4 : T3
1 : T4
2 : T4
3 : T4
4 : T1
4 : T4
 */