public class Customer {
    private static int lastId = 0; 
    private int id;
    private long startTime;
    private long endTime;

    public Customer(long startTime) {
        this.id = ++lastId;
        this.startTime = startTime;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }

    // Method to calculate the time spent
    public long getTimeSpent() {
        return endTime - startTime;
    }

    // Converting to seconds
    public long timeToSeconds() {
        long time = getTimeSpent();
        return time / 1000;
    }
    
    // Converting to minutes
    public long timeToMinutes() {
        long time = getTimeSpent();
        return time / 1000 / 60;
    }
}


