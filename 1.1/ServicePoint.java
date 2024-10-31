import java.util.LinkedList;

class ServicePoint {
    private final LinkedList<Customer> queue = new LinkedList<>();

    // Adds a customer to the queue
    public void addToQueue(Customer customer) {
        queue.addLast(customer);
        System.out.println("Customer " + customer.getId() + " has entered the queue.");
    }

    // Removes a customer from the queue in FIFO order
    public Customer removeFromQueue() {
        return queue.pollFirst(); 
    }

    // Serve all customers in the queue
    public void serve() {
        long startTime;
        while (!queue.isEmpty()) {
            Customer customer = removeFromQueue();
            if (customer != null) {
                startTime = System.currentTimeMillis();
                customer.setStartTime(startTime);
                long waitingTime = System.currentTimeMillis() - customer.getStartTime();
                int serviceTime = (int) (Math.random() * 3000) + 1000; 
                System.out.println("Serving customer " + customer.getId() + " with service time of " + serviceTime + " ms.");

                try {
                    Thread.sleep(serviceTime); // Simulate service time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                long responseTime = waitingTime + serviceTime;
                customer.setEndTime(System.currentTimeMillis());

                System.out.println("Customer " + customer.getId() + " served. Response time: " + responseTime + " ms. Time spent in service: " + customer.timeSpent() + " ms.");
            }
        }
    }
}