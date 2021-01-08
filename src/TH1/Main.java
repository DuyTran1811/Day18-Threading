package TH1;

public class Main {
    public static int DISTANCE = 100;

    public static void main(String[] args) {
        Car carA = new Car("Car A");
        Car carB = new Car("Car B");
        Car carC = new Car("Car C");

        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);
        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
