class CustomerGenerator {
    private final ServicePoint servicePoint;

    public CustomerGenerator(ServicePoint servicePoint) {
        this.servicePoint = servicePoint;
    }

    public void generateCustomers(int numCustomers) {
        for (int i = 0; i < numCustomers; i++) {
            Customer customer = new Customer(System.currentTimeMillis());
            servicePoint.addToQueue(customer);
            try {
                Thread.sleep(500); // Delay between customer arrivals
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}