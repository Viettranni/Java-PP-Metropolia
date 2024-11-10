package Task7;

public class Test {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        ContinuousGenerator generator = new RandomGenerator(); 
        ArrivalProcess arrivalProcess = new ArrivalProcess(generator, EventType.ARRIVAL);

        EventList eventList = new EventList();
        ServicePoint servicePoint = new ServicePoint();
        double currentTime = 0.0;

        // Generate 10 arrival events
        for (int i = 0; i < 10; i++) {
            arrivalProcess.addEvent(eventList, currentTime);
            Event lastEvent = eventList.getNextEvent();
            currentTime = lastEvent.getTime();
            clock.setTime(currentTime);

            // Add back the last event to the list after time update
            eventList.addEvent(lastEvent);
        }


        System.out.println("Generated Events:");
        eventList.printEvents();
        System.out.println("Time of last event: " + clock.getTime());

        // Process all events and add customers to the service point queue
        while (eventList.hasEvents()) {
            Event event = eventList.getNextEvent();
            if (event.getType() == EventType.ARRIVAL) {
                Customer customer = new Customer(event.getTime());
                servicePoint.addCustomer(customer);
            }
        }

        // Advance the clock slightly
        clock.advanceTime(5);

        // Process each customer at the service point
        System.out.println("Processing customers at the service point:");
        servicePoint.processCustomers();
    }
}
