// Q7.)A parking garage charges a $2.00 minimum fee to park for up to three hours. The garage charges an 
// additional $0.50 per hours for each hours or part thereof in excess of three hours. The maximum charge for any 
// given 24-hours period is $10.00.Assume that no car parks for longer than 24 hours at a time. Write an application 
// that calculates and displays the parking charges for each customers who parked in the garage yesterday. You 
// should enter the hours parked for each customers . The program should display  the charge for the current 
// customers and should calculate and display the running total os yesterday's receipts. It should use the method  
// calculate charges to determine the charge for each customer.

import java.util.ArrayList;
import java.util.Scanner;

public class GarageManager{
    private ArrayList<Customer> customers = new ArrayList<>();
    double totalReceipts = 0.0;

    public void processCustomers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of Customers: ");        
        int count = sc.nextInt();

        //loop to scan each entries
        for (int i = 1; i <= count; i++) {
            System.out.printf("Enter the hours Parked by Customer %d: ", i);
            double hours = sc.nextDouble();
            Customer customer = new Customer(i, hours);
            customers.add(customer);
            totalReceipts += customer.getCharge();
        }
        displaySummary();
        sc.close();
    }

    //to display all 
    private void displaySummary() {
        System.out.printf("%n%-10s%-10s%-10s%n", "Customer", "Hours", "Charge");
        for (Customer c : customers) {
            c.display();
        }
        System.out.printf("%nTotal receipts for yesterday: $%.2f%n", totalReceipts);
    }

}