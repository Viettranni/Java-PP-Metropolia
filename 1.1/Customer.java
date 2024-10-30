public class Customer {
    private static int idCounter = 1; 
    private int id;
    private long startTime;
    private long endTime;

    public Customer(long startTime) {
        this.id = idCounter++;
        this.startTime = startTime;
    }

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

    // Method to calculate time spent
    public long timeSpent() {
        return endTime - startTime;
    }
}
