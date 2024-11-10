package Task7;


public class ArrivalProcess {
    private ContinuousGenerator generator;
    private EventType eventType;

    public ArrivalProcess(ContinuousGenerator generator, EventType eventType) {
        this.generator = generator;
        this.eventType = eventType;
    }

    public void addEvent(EventList eventList, double currentTime) {
        double interval = generator.sample(); 
        double eventTime = currentTime + interval;
        Event newEvent = new Event(eventTime, eventType);
        eventList.addEvent(newEvent);
    }
}
