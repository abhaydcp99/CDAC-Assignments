// using Annonymous runnable class :

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

public class ThreadDemo5 {
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new AddRunnable(), "T1");
        Thread t2 = new Thread(new MulRunnable(), "T2");
         
        t1.start();
        t2.start();

//======= IMPPPPPPPPPPPPPPPPPPPPPPPPPP-------------------------------------



// >>>>>>>> USING ANNONYMOUS RUNNABLE CLASS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


        Thread t3 = new Thread(()->{
              
            System.out.println(Thread.currentThread().getName()+" started");
              int res = 1;
              for (int i = 0; i < 20; i++) {
               if(i % 2 == 0)
               res +=i;
            }
        System.out.println("Result = "+res+Thread.currentThread().getName()+" Ended");
        }, "T3-EvenAdd");




        // USING LAMBDA EXPRESSION :

        Thread t4 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+" started");
            int res = 1;
            for (int i = 0; i < 20; i++) {
             if(i % 2 != 0)                    // for odd number
             res +=i;
          }
      System.out.println("Result = "+res+Thread.currentThread().getName()+" Ended");
      }, "T3-OddAdd");
              

            t3.start();
            t4.start();
    }
}


// output :: using annonymous class

/*T1 started
T2 started
Sum = 190T1 Ended
Result = 46T2 Ended */



//   output ::    // USING LAMBDA EXPRESSION :


/*T2 started
T1 started
T3-OddAdd started
T3-EvenAdd started
Result = 101T3-OddAdd Ended
Result = 46T2 Ended
Result = 91T3-EvenAdd Ended
Sum = 190T1 Ended */