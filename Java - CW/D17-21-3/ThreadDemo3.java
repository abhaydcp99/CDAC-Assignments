class MyRun1 implements Runnable{

    @Override
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(i+" : "+Thread.currentThread().getName());
        }
    }
}


public class ThreadDemo3 {
          public static void main(String[] args) {
              Runnable r1 = () -> {                      // this is lamda function
                 System.err.println("Lambda function is working!!!");
            };
            Thread t1 = new Thread(r1);

            t1.start();
    } 
}

/*OUTPUT :: Lambda function is working!!! */


// runnable interface ko enble kiya using lambda expreassion at line 14, 15

// lambda function ko thread use krke implement kro then use this code