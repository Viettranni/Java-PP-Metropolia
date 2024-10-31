public class ServiceSystem {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        CustomerGenerator generator = new CustomerGenerator(servicePoint);

        // Generate a specified number of customers
        int numCustomers = 5;
        generator.generateCustomers(numCustomers);

        // Start serving customers
        servicePoint.serve();
    }
}