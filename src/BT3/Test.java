package BT3;

public class Test {
    public static void main(String[] args) {
        LazyPrimeFactorization l1 = new LazyPrimeFactorization(10);
        OptimizedPrimeFactorization l2 = new OptimizedPrimeFactorization(10);
        Thread thread1 = new Thread(l1);
        Thread thread2 = new Thread(l2);
        thread1.start();
        thread2.start();
    }
}
