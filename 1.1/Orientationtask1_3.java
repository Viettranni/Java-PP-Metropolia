public class Orientationtask1_3 {
    public static void main(String[] args) {
        // Create customers with start time using currentTimeMillis
        Customer customer1 = new Customer(System.currentTimeMillis());
        Customer customer2 = new Customer(System.currentTimeMillis() + 2000);
        Customer customer3 = new Customer(System.currentTimeMillis() + 4000);


        // Setting the end times for each customer
        customer1.setEndTime(customer1.getStartTime() + 5000);
        customer2.setEndTime(customer2.getStartTime() + 3000);
        customer3.setEndTime(customer3.getStartTime() + 1000);

        // Printing out the time the customer spent in queue
        System.out.println("Customer ID: " + customer1.getId() + ", time spent in queue: " + customer1.timeSpent() + "ms. " );
        System.out.println("Customer ID: " + customer2.getId() + ", time spent in queue: " + customer2.timeSpent() + "ms. " );
        System.out.println("Customer ID: " + customer3.getId() + ", time spent in queue: " + customer3.timeSpent() + "ms. " );

    }
}
