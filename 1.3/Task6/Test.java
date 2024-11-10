package Task6;

public class Test {
    public static void main(String[] args) {
        // Set up the random generator and event type for the arrival process
        ContinuousGenerator generator = new RandomGenerator(); // Use RandomGenerator for simplicity
        ArrivalProcess arrivalProcess = new ArrivalProcess(generator, "StudentArrival");

        // Create an EventList to store arrival events
        EventList eventList = new EventList();
        
        // Set up the initial time
        double currentTime = 0.0;

        // Generate 10 events
        for (int i = 0; i < 10; i++) {
            arrivalProcess.addEvent(eventList, currentTime);
            // Move the clock forward to the time of the most recent event
            currentTime = eventList.getEvents().get(eventList.getEvents().size() - 1).getTime();
        }

        // Print the event list
        System.out.println("Generated events:");
        eventList.printEvents();
    }
}
