public class Clock {
    // Singleton instance ( Can be named any )
    private static Clock instance; 
    private long currentTime;

    // Private constructor to prevent instantiation
    private Clock() {
        this.currentTime = 0;
    }

    // Public method to access the singleton instance
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    // Methods 
    public void setTime(long time) {
        this.currentTime = time;
    }

    public long getTime() {
        return currentTime;
    }

    public void increaseTime(long amount) {
        this.currentTime += amount;
    }

}
