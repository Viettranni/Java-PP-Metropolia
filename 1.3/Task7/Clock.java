package Task7;

public class Clock {
    private static Clock instance = new Clock();
    private double time;

    private Clock() {
        time = 0.0;
    }

    public static Clock getInstance() {
        return instance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void advanceTime(double amount) {
        time += amount;
    }
}
