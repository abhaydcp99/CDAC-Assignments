// Creating a thread by extending Thread class
class BaristaThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Barista is preparing coffee " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }
    }
}

// Creating a thread by implementing Runnable interface
class CashierRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Cashier is taking order " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }
    }
}

public class MultithreadingDemo {  // Class name updated
    public static void main(String[] args) {
        BaristaThread barista = new BaristaThread();  // Thread 1
        Thread cashier = new Thread(new CashierRunnable());  // Thread 2

        barista.start();  // Starts the Barista thread
        cashier.start();  // Starts the Cashier thread
    }
}


/*Barista is preparing coffee 1
Cashier is taking order 1
Barista is preparing coffee 2
Cashier is taking order 2
Barista is preparing coffee 3
Cashier is taking order 3
...
 */


 /*Explanation of Code:
BaristaThread extends Thread → This represents the barista preparing coffee.
CashierRunnable implements Runnable → This represents the cashier taking orders.
Both threads start simultaneously → The barista prepares coffee while the cashier takes orders. */