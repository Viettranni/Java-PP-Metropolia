import java.util.Random;

public class CallCenterSimulation {
    public static void main(String[] args) throws InterruptedException {
        EventList eventList = new EventList();
        Random random = new Random();

        // Add initial event (first customer arrives)
        eventList.addEvent(new Event(System.currentTimeMillis(), EventType.ARRIVAL, ClientType.X));
        eventList.addEvent(new Event(System.currentTimeMillis() + random.nextInt(1000), EventType.ARRIVAL, ClientType.Y));

        while (!eventList.isEmpty()) {
            Event currentEvent = eventList.getNextEvent();
            System.out.println("Processing " + currentEvent.getEventType() +
                               " for client " + currentEvent.getClientType() +
                               " at time " + currentEvent.getEventTime());

            if (currentEvent.getEventType() == EventType.EXIT && currentEvent.getClientType() == ClientType.Y) {
                System.out.println("Client Y exited. Ending simulation.");
                break;
            }

            switch (currentEvent.getEventType()) {
                case ARRIVAL:
                    // Schedule service start for the client
                    long serviceStartTime = System.currentTimeMillis() + random.nextInt(1000);
                    eventList.addEvent(new Event(serviceStartTime, EventType.START_SERVICE, currentEvent.getClientType()));
                    System.out.println("Scheduled START_SERVICE for client " + currentEvent.getClientType() +
                                       " at time " + serviceStartTime);
                    break;

                case START_SERVICE:
                    // Schedule exit for the client after service
                    long exitTime = System.currentTimeMillis() + random.nextInt(1000);
                    eventList.addEvent(new Event(exitTime, EventType.EXIT, currentEvent.getClientType()));
                    System.out.println("Scheduled EXIT for client " + currentEvent.getClientType() +
                                       " at time " + exitTime);
                    break;

                case EXIT:
                    // Log exit time
                    System.out.println("Client " + currentEvent.getClientType() + " exited at " + currentEvent.getEventTime());
                    break;
            }
        }
    }
}
