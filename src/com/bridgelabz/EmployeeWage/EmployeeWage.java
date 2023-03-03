package com.bridgelabz.EmployeeWage;

import java.util.Random;

public class EmployeeWage {
    private static final int FULL_TIME = ;
    private static final int PART_TIME = ;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem");


        Random random = new Random();
        int present = random.nextInt(3);
        //Check if employee is present
        int WagePerHr = 20;
        int dailyWage, workingHrs;
        switch (present){
            case FULL_TIME :
                workingHrs = 8;
                System.out.println("Employee Working Fullday");
                break;
            case PART_TIME:
                workingHrs =4;
                System.out.println("Employee Working Part Time");
                break;
            default:
                workingHrs = 0;
                System.out.println("Employee Absent");
        }
        dailyWage = workingHrs * WagePerHr;
        System.out.println("Daily wage is " + dailyWage);


    }
}
