// Q7.)A parking garage charges a $2.00 minimum fee to park for up to three hours. The garage charges an 
// additional $0.50 per hours for each hours or part thereof in excess of three hours. The maximum charge for any 
// given 24-hours period is $10.00.Assume that no car parks for longer than 24 hours at a time. Write an application 
// that calculates and displays the parking charges for each customers who parked in the garage yesterday. You 
// should enter the hours parked for each customers . The program should display  the charge for the current 
// customers and should calculate and display the running total os yesterday's receipts. It should use the method  
// calculate charges to determine the charge for each customer.

public class ParkingCalculator{
    public static double chargeCalculator(double hours){
        double charge = 2.0;
        if(hours > 3.0){
            charge += 0.5 * Math.ceil(hours - 3.0);
        }
        return Math.min(charge, 10.0);
    }
}