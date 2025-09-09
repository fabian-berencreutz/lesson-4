package se.iths.fabian.lesson4;

public class Car {
    private int speed = 0;
    private boolean started = false;

    public void start() {
        this.started = true;
    }

    public void accelerate(int accelerate) {
        if (started) {
            this.speed += accelerate;
        } else {
            throw new IllegalArgumentException("Du måste starta bilen först.");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void stop() {
        if (isMoving()) {
            speed = 0;
            started = false;
        } else {
            System.out.println("Bilen står redan stilla.");
        }
    }

    private boolean isMoving() {
        return speed > 0;
    }
}
