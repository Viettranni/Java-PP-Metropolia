import java.util.PriorityQueue;

public class Event implements Comparable<Event> {
    private long eventTime;
    private EventType eventType; // Add event type to the event

    public enum EventType {
        ARRIVAL,
        EXIT
    }
    

    public Event(long eventTime, EventType eventType) {
        this.eventTime = eventTime;
        this.eventType = eventType;
    }

    public long getEventTime() {
        return eventTime;
    }

    public EventType getEventType() {
        return eventType;
    }

    @Override
    public int compareTo(Event other) {
        return Long.compare(this.eventTime, other.eventTime); // Sort by event time
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventTime=" + eventTime +
                ", eventType=" + eventType +
                '}';
    }

    public static void main(String[] args) {
        PriorityQueue<Event> eventQueue = new PriorityQueue<>();

        // Add events with different times and types
        eventQueue.add(new Event(System.currentTimeMillis() + 3000, EventType.ARRIVAL));
        eventQueue.add(new Event(System.currentTimeMillis() + 1000, EventType.EXIT));
        eventQueue.add(new Event(System.currentTimeMillis() + 2000, EventType.ARRIVAL));

        // Process events in order
        while (!eventQueue.isEmpty()) {
            Event nextEvent = eventQueue.poll();
            System.out.println("Processing " + nextEvent);
        }
    }
}
