package EmployeeWageComputationProblem;
import java.util.Random;
public class Company {
    private String name;
    private double wage;
    private int workingDays;
    private int workingHours;

    public Company(String name, double wage, int workingDays, int workingHours) {
        this.name = name;
        this.wage = wage;
        this.workingDays = workingDays;
        this.workingHours = workingHours;
    }

    public double calculateEmployeeWage(int totalHoursWorked) {
        // Calculate the number of days worked based on total hours worked
        int totalDaysWorked = totalHoursWorked / workingHours;

        // Calculate the employee wage for the month
        double employeeWage = totalDaysWorked * wage * workingHours;

        // Adjust the employee wage if the total hours worked is not a multiple of working hours
        if (totalHoursWorked % workingHours != 0) {
            int remainingHours = totalHoursWorked % workingHours;
            employeeWage += remainingHours * wage;
        }

        return employeeWage;
    }

    public String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        // Create instances of the Company class
        Company company1 = new Company("Company 1", 10.0, 20, 100);
        Company company2 = new Company("Company 2", 12.0, 22, 110);

        // Calculate employee wages for each company
        double employeeWage1 = company1.calculateEmployeeWage(120);
        double employeeWage2 = company2.calculateEmployeeWage(100);

        // Output the results
        System.out.println("Employee wage for " + company1.getName() + ": $" + employeeWage1);
        System.out.println("Employee wage for " + company2.getName() + ": $" + employeeWage2);
    }
}