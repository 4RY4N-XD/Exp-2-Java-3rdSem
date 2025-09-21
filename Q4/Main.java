// Q4.) Create a class called date that include three instance variable a) month(type int) b)day (type int) and c) year 
// (type int) . provide a constructer that initialize a three instance variable and assume the value provided are 
// correct. Provide a set and a get method for each instance variable.Provide a method DisplayDate that display the 
// month year and day separated by forward slashand write a test application named DateTest that demonstrate 
// date capabilities. 

public class Main {
    public static void main(String[] args) {
        Date date = new Date(12, 25, 2023);
        System.out.println("The date is: " + date); // Uses toString()

        // Testing set methods
        date.setMonth(1);
        date.setDay(1);
        date.setYear(2024);
        System.out.println("Updated date is: " + date);

        // Getting individual components
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDay());
        System.out.println("Year: " + date.getYear());
    }
}