import java.util.Random;

public class Car implements Runnable {
    private String name;
    public static int DISTANCE = 100;
    public static int STEP = 2;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE) {
            try {
                int speed = (new Random()).nextInt(20);
                runDistance += speed;
                String log = "|";
                int percentTravel = runDistance / STEP;
                for (int i = 0; i <= DISTANCE/STEP; i++) {
                    if (percentTravel > i) {
                        log += "=";
                    } else if (percentTravel == i) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + ": " + (endTime - startTime)/1000+ "s");
    }
}
