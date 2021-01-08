package BT2;

public class Tets {
    public static void main(String[] args) {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();
        Thread thread1 = new Thread(odd);
        Thread thread2 = new Thread(even);
        thread1.start();
        thread2.start();
    }
}
