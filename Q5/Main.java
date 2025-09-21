// Q5.)(Gas mileage ) Drivers are concerned with the mileage theit automobiles get. One driver has kept track of 
// several trips by recording the miles driven and gallons used for each tankful.Develop a java application that will 
// input the miles driven and gallons used(both as in) for each trip.The program should calculate and display the 
// miles per gallon obtained for each trip and print the combined miles per gallon obtained for all trips up to this 
// point. All averaging calculate should produce floating point results. Use class scanner and sentinel-controlled 
// repetition to obtain the data from the user. 

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMiles = 0;
        double totalGallons = 0;

        while (true) {
            System.out.print("Enter miles driven (-1 to end): ");
            double miles = scanner.nextDouble();
            if (miles == -1) {
                break;
            }

            System.out.print("Enter gallons used: ");
            double gallons = scanner.nextDouble();
            if (gallons <= 0) {
                System.out.println("Gallons must be greater than zero. Please try again.");
                continue;
            }

            double mpg = miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f\n", mpg);

            totalMiles += miles;
            totalGallons += gallons;

            double totalMpg = totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon so far: %.2f\n\n", totalMpg);
        }

        System.out.println("Thank you for using the mileage calculator.");
        scanner.close();
    }
}