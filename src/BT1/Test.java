package BT1;

public class Test {
    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator("01");
        NumberGenerator num2 = new NumberGenerator("02");
        Thread thread1 = new Thread(num1);
        Thread thread2 = new Thread(num2);
        thread1.start();
        thread2.start();
    }
}
