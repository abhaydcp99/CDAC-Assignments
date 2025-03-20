@FunctionalInterface
interface Hellocdac {
    void sayHello1(); // Functional interface method
}

@FunctionalInterface
interface SquareCalculator {
    int square(int n); // Functional interface for squaring a number
}

@FunctionalInterface
interface MathOp {
    int calculate(int a, int b); // Functional interface for mathematical operations
}

public class LambdaEx1 {
    public static void main(String[] args) {
        // Lambda expression for Hellocdac
        Hellocdac h1 = () -> System.out.println("Hello Lambda!");
        h1.sayHello1();
        
        // Lambda expression for SquareCalculator
        SquareCalculator d1 = (n) -> n * n;
        System.out.println(d1.square(5)); // Output: 25
        
        // Lambda expression for MathOp (addition operation)
        MathOp m1 = (a, b) -> a + b;
        System.out.println(m1.calculate(5, 10)); // Output: 15
        
        // Lambda expression for Runnable (multithreading example)
        Runnable r = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread " + i);
            }
        };
        
        Thread t = new Thread(r);
        t.start();
    }
}