import java.util.LinkedList;
import java.util.Scanner;

public class Orientationtask1_4 {
    // Declearing the list
    private static LinkedList<Customer> customerList = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long startTime, endTime;
        int action;
        
        System.out.println("Welcome to our Line Manager!"); 

        System.out.println("1: Add customer to head of the list");
        System.out.println("2: Remove the customer from the begginning of the list");
        System.out.println("3: Exit the program");

        do {
            System.out.println("Enter the action (1/2/3): ");
            action = scanner.nextInt();
            
            switch (action) {
                case 1:
                    startTime = System.nanoTime();
                    Customer newCustomer = new Customer(startTime);
                    newCustomer.setStartTime(startTime);
                    customerList.addFirst(newCustomer);
                    System.out.print("Customer " + newCustomer.getId() + " has been added to the list! ");
                    break;

                case 2: 
                    if (!customerList.isEmpty()){
                        Customer removedCustomer = customerList.removeLast();
                        endTime = System.nanoTime();
                        removedCustomer.setEndTime(endTime);
                        System.out.println( "The customer last customer has been removed and he/she waited for " + removedCustomer.timeSpent() + "ms/n in the list!" );

                    } else {
                        System.out.println("The Customer list is empty, please add a customer!");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using Customer List Simulator! Exiting the program.");

                default:
                    System.out.println("Please enter a valid action from 1, 2 or 3!");
            }

        } while (action != 3);
        scanner.close();
    }
}
