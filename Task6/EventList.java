package Task6;
import java.util.ArrayList;
import java.util.List;

public class EventList {
    private List<Event> events = new ArrayList<>();

    public void addEvent(Event event) {
        events.add(event);
    }

    public List<Event> getEvents() {
        return events;
    }

    public void printEvents() {
        for (Event event : events) {
            System.out.println(event);
        }
    }
}
