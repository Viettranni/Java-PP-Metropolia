import java.util.Random;

public class EventSimulationTest {
    public static void main(String[] args) {
        EventList eventList = new EventList();
        Random random = new Random();

        // Since the program is generating events to the current time and randomises the event time, the PriorityQueue will but them in the correct timeline to execute each event.

        // a) Generate a list of events with random event times
        for (int i = 0; i < 5; i++) {
            long randomEventTime = System.currentTimeMillis() + random.nextInt(1000);
            Event event = new Event(randomEventTime);
            eventList.addEvent(event);
            System.out.println("Added: " + event);
        }

        System.out.println("\n--- Removing the first (next to be processed) event ---");
        // b) Remove the first event from the list
        Event nextEvent = eventList.getNextEvent();
        System.out.println("Removed: " + nextEvent);

        // c) Print the remaining events in the EventList in chronological order
        System.out.println("\n--- Remaining events in chronological order ---");
        eventList.printEventsChronologically();
    }
}
