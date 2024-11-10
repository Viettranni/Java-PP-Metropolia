package Task5;

public class ClockTest {
    public static void main(String[] args) {
        // Get the singleton Clock instance
        Clock clock = Clock.getInstance();
        
        // Setting initial time
        clock.setTime(1000);
        System.out.println("Initial Time: " + clock.getTime());
        
        // Adding more time
        clock.increaseTime(500);
        System.out.println("Time after incrementing by 500: " + clock.getTime());
        
        // Set a new time
        clock.setTime(2000);
        System.out.println("Time after setting to 2000: " + clock.getTime());

        // Ensure only one instance exists by getting the instance again
        Clock anotherClock = Clock.getInstance();
        System.out.println("Time from another instance reference: " + anotherClock.getTime());

        // Verify that modifying the time through another reference affects the singleton instance
        anotherClock.increaseTime(100);
        System.out.println("Time after incrementing by 100 via another reference: " + clock.getTime());

        // Adding more time to the instance and checking if it's the same
        clock.increaseTime(50);
        System.out.println("Time should be + 50 form the previous 'instance': " + clock.getTime());

    }
}
