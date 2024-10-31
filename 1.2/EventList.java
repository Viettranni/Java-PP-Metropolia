import java.util.PriorityQueue;

class EventList {
    private PriorityQueue<Event> eventQueue;
    
    public EventList() {
        eventQueue = new PriorityQueue<>();
    }
    
    public void addEvent(Event event) {
        eventQueue.add(event);
    }
    
    public Event getNextEvent() {
        return eventQueue.poll();
    }
    
    public void printEventsChronologically() {
        PriorityQueue<Event> tempQueue = new PriorityQueue<>(eventQueue);
        
        while (!tempQueue.isEmpty()) {
            System.out.println(tempQueue.poll());
        }
    }
    
    public boolean isEmpty() {
        return eventQueue.isEmpty();
    }
}
