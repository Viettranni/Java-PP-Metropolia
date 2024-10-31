
class Event implements Comparable<Event> {
    private long eventTime;
    
    public Event(long eventTime) {
        this.eventTime = eventTime;
    }
    
    public long getEventTime() {
        return eventTime;
    }
    
    @Override
    public int compareTo(Event other) {
        return Long.compare(this.eventTime, other.eventTime);
    }
    
    @Override
    public String toString() {
        return "Event Time: " + eventTime;
    }
}
