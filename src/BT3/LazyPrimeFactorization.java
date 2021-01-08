package BT3;

public class LazyPrimeFactorization implements Runnable {
    private int number;

    public LazyPrimeFactorization(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < number; i++) {
            if (checkPrime(i)) System.out.println("Thread 1 " + i);
        }
    }

    public boolean checkPrime(int n) {
        if (n < 2) return false;
        else for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
