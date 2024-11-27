import java.util.Scanner;

// Base class
class Employee {
    double basicSalary;

    // Constructor to initialize basic salary
    public Employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }
}

// Derived class
class SalaryCalculator extends Employee {
    double bonus;
    double increment;

    // Constructor to initialize bonus and increment along with basic salary
    public SalaryCalculator(double basicSalary, double bonus, double increment) {
        super(basicSalary); // Call base class constructor
        this.bonus = bonus;
        this.increment = increment;
    }

    // Method to calculate gross salary
    public double calculateGrossSalary() {
        return basicSalary + bonus + increment;
    }
}

public class GrossSalaryCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for basic salary
        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();

        // Take input for bonus
        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();

        // Take input for increment
        System.out.print("Enter increment: ");
        double increment = sc.nextDouble();

        // Create an object of the derived class
        SalaryCalculator employee = new SalaryCalculator(basicSalary, bonus, increment);

        // Calculate and display the gross salary
        double grossSalary = employee.calculateGrossSalary();
        System.out.println("Gross Salary: " + grossSalary);

        sc.close();
    }
}
