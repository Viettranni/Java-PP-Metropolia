package Task7;

import java.util.LinkedList;
import java.util.Queue;

public class ServicePoint {
    private Queue<Customer> queue = new LinkedList<>();

    public void addCustomer(Customer customer) {
        queue.add(customer);
    }

    public void processCustomers() {
        Clock clock = Clock.getInstance();

        while (!queue.isEmpty()) {
            Customer customer = queue.poll();
            double arrivalTime = customer.getArrivalTime();
            double timeSpent = clock.getTime() - arrivalTime;
            System.out.println("Customer processed. Arrival time: " + arrivalTime + ", Time spent: " + timeSpent);
        }
    }
}
