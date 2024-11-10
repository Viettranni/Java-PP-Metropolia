package Task7;

import java.util.LinkedList;
import java.util.Queue;

public class EventList {
    private Queue<Event> events = new LinkedList<>();

    public void addEvent(Event event) {
        events.add(event);
    }

    public Event getNextEvent() {
        return events.poll();
    }

    public boolean hasEvents() {
        return !events.isEmpty();
    }

    public void printEvents() {
        for (Event event : events) {
            System.out.println(event);
        }
    }
}
