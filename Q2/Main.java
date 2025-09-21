//Q2.) Create a class called invoice that hardware store might use to represent an 
// invoice for an item sold at the store. An invoice should include four pieces of 
// information as instance variable  
//  a part number(type string) 
//  a part description(type string) 
//  a quantity of the item being purchased(type int)  
//  a price per item(double) 
// Your class should have a constructor that initialization the four instance variable . 
// Provide a set and a get method for each instance variable . In addition provide 
// method named getInvoiceAmount that calculate the invoice amount(i.e.  multiplies 
// the quantity per item ), then return the amount as a double value.If the quantity is not 
// positive it should be set to 0. If the price per item is not positive it should be set to 
// 0.0. Write test application named invoice test that demonstration class invoice 
// capabilities.  


public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1234", "Hammer", 5, 15.99);
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: ₹" + invoice.getPricePerItem());
        System.out.println("Total Invoice Amount: ₹" + String.format("%.2f", invoice.getInvoiceAmount()));

        // Testing with negative values
        Invoice invoice2 = new Invoice("5678", "Nails", -10, -2.50);
        System.out.println("\nPart Number: " + invoice2.getPartNumber());   
        System.out.println("Part Description: " + invoice2.getPartDescription());
        System.out.println("Quantity: " + invoice2.getQuantity()); // Should be 0
        System.out.println("Price per Item: ₹" + invoice2.getPricePerItem()); // Should be 0.0
        System.out.println("Total Invoice Amount: ₹" + String.format("%.2f", invoice2.getInvoiceAmount())); // Should be 0.0

        //Testing set methods
        invoice2.setQuantity(20);
        invoice2.setPricePerItem(3.75);
        System.out.println("\nUpdated Quantity: " + invoice2.getQuantity());
        System.out.println("Updated Price per Item: ₹" + invoice2.getPricePerItem());
        System.out.println("Updated Total Invoice Amount: ₹" + String.format("%.2f", invoice2.getInvoiceAmount())); // Should be 75.0
    }
}