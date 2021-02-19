package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.CH_7.EXERCISES;

import java.util.Scanner;

/**
 * This program stores in an array the hours worked by
 * five employees who all make the same hourly wage.
 */

public class PayArray {
    public static void main(String[] args) {
        final int NUM_EMPLOYEES = 5; // Number of employees
        double payRate;             // Gross pay

        // Create an array for employee hours.
        int[] hours = new int[NUM_EMPLOYEES];
        double[] weeklySalary = new double[NUM_EMPLOYEES];

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

       // Write a for loop which captures the users values and stores them on hours array.

        // we are going to start at 0
        // go up until 5 employees
        // store the users input -> and calculate the salary

        for (int i = 0; i<NUM_EMPLOYEES; i++){
            // collecting the users input
            System.out.println("What is the hours");
            int hour = keyboard.nextInt();
            System.out.println("What is the salary?");
            double salary = keyboard.nextDouble();
            // hours index = hours given to us => [0]: whatever the user gave me
            hours[i] = hour;
            weeklySalary[i] = salary*hour;

        }
        for (double employeeSalary:weeklySalary){
            System.out.println(employeeSalary);

        }



    }

}