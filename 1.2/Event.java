public class Event implements Comparable<Event> {
    private long eventTime;
    private EventType eventType;
    private ClientType clientType;

    public Event(long eventTime, EventType eventType, ClientType clientType) {
        this.eventTime = eventTime;
        this.eventType = eventType;
        this.clientType = clientType;
    }

    public long getEventTime() { return eventTime; }
    public EventType getEventType() { return eventType; }
    public ClientType getClientType() { return clientType; }

    @Override
    public int compareTo(Event other) {
        return Long.compare(this.eventTime, other.eventTime);
    }
}
