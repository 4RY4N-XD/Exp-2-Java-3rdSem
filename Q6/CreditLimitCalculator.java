// Q6.) (Credit limit calculator) Develop a java application that determines whether any of several department 
// store customer has exceeded the credit limit on a charge account. For each customer following facts are available: 
//  account number. 
//  balance at the begining of the month. 
//  total of all items charged by the customer this month. 
//  total of all credits applied to the 

import java.util.Scanner;

public class CreditLimitCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of customers to process
        System.out.print("Enter number of customers: ");
        int customerCount = scanner.nextInt();

        for (int i = 1; i <= customerCount; i++) {
            System.out.println("\nCustomer #" + i);

            // Input customer details
            System.out.print("Account Number: ");
            int accountNumber = scanner.nextInt();

            System.out.print("Balance at beginning of month: ₹");
            double beginningBalance = scanner.nextDouble();

            System.out.print("Total charges this month: ₹");
            double charges = scanner.nextDouble();

            System.out.print("Total credits this month: ₹");
            double credits = scanner.nextDouble();

            System.out.print("Credit limit: ₹");
            double creditLimit = scanner.nextDouble();

            // Calculate new balance
            double newBalance = beginningBalance + charges - credits;

            // Display result
            System.out.println("New balance: ₹" + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded for account #" + accountNumber);
            } else {
                System.out.println("Within credit limit.");
            }
        }

        scanner.close();
    }
}