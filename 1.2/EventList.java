import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> events = new PriorityQueue<>();

    public void addEvent(Event event) { events.add(event); }
    public Event getNextEvent() { return events.poll(); }
    public boolean isEmpty() { return events.isEmpty(); }
}
