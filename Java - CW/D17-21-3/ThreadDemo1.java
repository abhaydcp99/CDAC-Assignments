
// Method 1 :: THREAD CLASS EXTENDS == THREAD CLASSS KO INHERIT KIYA


class Mythread extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i + " : " + Thread.currentThread().getName());
        }
    }
}

public class ThreadDemo1 {
    public static void main(String args[]) {
        // Correcting the object creation with unique names
        Mythread t1 = new Mythread();
        t1.setName("T1");
        
        Mythread t2 = new Mythread();
        t2.setName("T2");
        
        Mythread t3 = new Mythread();
        t3.setName("T3");
        
        Mythread t4 = new Mythread();
        t4.setName("T4");

        // Starting the threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}



/*
 0 : T2
1 : T2
0 : T1
0 : T3
0 : T4
2 : T2
1 : T1
2 : T1
3 : T1
4 : T1
1 : T3
2 : T3
1 : T4
2 : T4
3 : T4
3 : T2
5 : T1
3 : T3
4 : T4
4 : T2
5 : T2
6 : T1
7 : T1
8 : T1
4 : T3
5 : T3
6 : T3
7 : T3
8 : T3
5 : T4
6 : T4
6 : T2
9 : T1
7 : T4
8 : T4
9 : T4
7 : T2
9 : T3
8 : T2
10 : T1
10 : T4
11 : T4
12 : T4
10 : T3
9 : T2
10 : T2
11 : T2
11 : T1
13 : T4
14 : T4
11 : T3
12 : T3
12 : T2
12 : T1
15 : T4
13 : T3
14 : T3
15 : T3
16 : T3
13 : T2
13 : T1
14 : T1
15 : T1
16 : T1
16 : T4
17 : T4
17 : T3
14 : T2
17 : T1
18 : T4
18 : T3
19 : T3
15 : T2
16 : T2
18 : T1
19 : T1
19 : T4
17 : T2
18 : T2
19 : T2
 */