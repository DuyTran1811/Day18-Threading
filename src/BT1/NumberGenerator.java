package BT1;

public class NumberGenerator implements Runnable {
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(name + (i) + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
