package TH1;

import java.util.Random;

public class Car implements Runnable {
    public static int DISTANCE = 100;

    public static int STEP = 2;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < Main.DISTANCE) {
            int speed = (new Random()).nextInt(20);
            runDistance += speed;
            StringBuilder log = new StringBuilder("|");
            int percentTravel = (runDistance * 100) / DISTANCE;
            for (int i = 0; i < DISTANCE; i += STEP) {
                if (percentTravel >= i + STEP) {
                    log.append("=");
                } else if (percentTravel >= i && percentTravel < i + STEP) {
                    log.append("o");
                } else {
                    log.append("-");
                }
            }
            log.append("|");
            System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + " Broken...");
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
