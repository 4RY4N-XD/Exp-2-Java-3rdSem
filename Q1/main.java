// 1)Create an application that calculate  your daily driving cost , so that you can 
// estimate how much money could be saved by car pooling which also has other 
// advantages such as reducing carbon emission and traffic congestion . The application 
// should input the following informationand display the user's cost per day of driving 
// to work. 
//  a)total miles driven per day  
//  b)cost per gallon of gasoline 
//  c)average fees per day  
//  d)tolls per day  

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input collection
        System.out.print("Enter total miles driven per day: ");
        double milesPerDay = sc.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ₹");
        double costPerGallon = sc.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = sc.nextDouble();

        System.out.print("Enter parking fees per day: ₹");
        double parkingFees = sc.nextDouble();

        System.out.print("Enter tolls per day: ₹");
        double tolls = sc.nextDouble();

        // Calculations
        double gallonsUsed = milesPerDay / milesPerGallon;
        double fuelCost = gallonsUsed * costPerGallon;
        double totalCost = fuelCost + parkingFees + tolls;

        // Output
        System.out.println("\n Estimated Daily Driving Cost: ₹" + String.format("%.2f", totalCost));
        System.out.println("Consider carpooling to save money and reduce carbon emissions!");
        
        sc.close();
    }
}