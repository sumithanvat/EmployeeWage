package com.bridgelabz.EmployeeWage;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem");


        Random random = new Random();
        int present = random.nextInt(2);
        //Check if employee is present
        int WagePerHr =20;
        int wrkHrs = 8;
        int dailyWage = present * WagePerHr * wrkHrs;

        if (present == 1)
            System.out.println("Employee is present and Daily Wage Is " + dailyWage);
        else
            System.out.println("Employee is absent so Daily Wage is "+ dailyWage);
    }
}
