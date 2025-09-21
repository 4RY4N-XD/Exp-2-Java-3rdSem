// Q3.)Create a class called employee that include three instance variable a)name(type string) b) last name (type 
// string) and c) monthly salary(double). Provide a constructor that initialize the three instance variable. Provide a 
// set and a get method of instance variable. if the monthly salary is not positive do not set its value. Write a test 
// aplication named employeetest that demonstrate class employee capabilities.create two employee object and 
// display each object yearly salary. Then give each employee a 10% hike and display each employee yearly salary 
// again. 

public class Main{
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Doe", 3000);
        Employee emp2 = new Employee("Jane", "Smith", 4000);

        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "'s Yearly Salary: ₹" + String.format("%.2f", emp1.getYearlySalary()));
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "'s Yearly Salary: ₹" + String.format("%.2f", emp2.getYearlySalary()));

        // Giving a 10% raise to both employees
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("\nAfter 10% Raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "'s Yearly Salary: ₹" + String.format("%.2f", emp1.getYearlySalary()));
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "'s Yearly Salary: ₹" + String.format("%.2f", emp2.getYearlySalary()));
    }
}