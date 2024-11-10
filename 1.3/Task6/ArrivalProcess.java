package Task6;

public class ArrivalProcess {
    private ContinuousGenerator generator; 
    private String eventType;

    public ArrivalProcess(ContinuousGenerator generator, String eventType) {
        this.generator = generator;
        this.eventType = eventType;
    }

    /**
     * Adds an event to the event list with a randomly generated interval.
     * @param eventList the event list to which the event is added
     * @param currentTime the current time to base the arrival time on
     */
    public void addEvent(EventList eventList, double currentTime) {
        double interval = generator.sample(); // get random interval
        double eventTime = currentTime + interval;
        Event newEvent = new Event(eventTime, eventType);
        eventList.addEvent(newEvent);
    }
}
