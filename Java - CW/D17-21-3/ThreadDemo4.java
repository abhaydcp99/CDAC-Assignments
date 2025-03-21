class AddRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" started");
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            sum +=i;
        }
        System.err.println("Sum = "+sum+Thread.currentThread().getName()+" Ended");
    }
}


class MulRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" started");
        int res = 1;
        for (int i = 0; i < 10; i++) {
            res +=i;
        }
        System.err.println("Result = "+res+Thread.currentThread().getName()+" Ended");
    }
}

public class ThreadDemo4 {
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new AddRunnable(), "T1");
        Thread t2 = new Thread(new MulRunnable(), "T2");
         
        t1.start();
        t2.start();
    }
}


/*output ::
 T1 started
T2 started
Result = 46T2 Ended
Sum = 190T1 Ended
 */