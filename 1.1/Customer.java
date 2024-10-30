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

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    // Method to calculate the time spent
    public long getTimeSpent() {
        return endTime - startTime;
    }
}


