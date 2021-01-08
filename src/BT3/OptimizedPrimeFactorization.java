package BT3;

public class OptimizedPrimeFactorization implements Runnable {
    private int num;

    public OptimizedPrimeFactorization(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < num; i++) {
            check(i);
        }
    }

    public boolean check(int n) {
        for (int i = 1; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println("Thead 2 "+i);
        }
        return true;
    }
}
