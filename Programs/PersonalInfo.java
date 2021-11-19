package com.company;
import java.util.Scanner;
public class PersonalInfo {
    /**
     * Prints out information about the user (after user input)
     * @author Brandon Lee Felix
     * @since 17/9/21
     */

    public static void main(String[] args) {


            Scanner myInput = new Scanner(System.in); // allows the system to scan for user inputs (answers.)

        //prints out a series of questions which the user has to answer.

        //reads string inputs
        System.out.println("Please enter your name:");
        String name = myInput.nextLine();
        System.out.println("Please enter your gender:");
        String gender = myInput.nextLine();
        System.out.println("Please enter your department:");
        String dept = myInput.nextLine();

        //reads numerical inputs
        System.out.println("Please enter your age:");
        double age = myInput.nextDouble();
        System.out.println("Please enter the value of PI (3.1415926):");
        double pi = myInput.nextDouble();

        String headingName = "Name";
        String headingGender = "Gender";
        String headingDepartment = "Department";
        String headingAge = "Age";
        String headingPi = "PI";
        String format = "%-10s %5s %1s %n"; // %-10 is for the heading, -5s is for the space between the heading and colon, %1s is for the space between the colon and output

        // returns the user's answers to the questions above.
        System.out.printf(format,headingName, ":", name);
        System.out.printf(format,headingGender, ":", gender);
        System.out.printf(format,headingDepartment, ":", dept);
        System.out.printf(format,headingAge, ":", Math.round(age));
        System.out.printf(format,headingPi, ":", Math.round(pi * 100.0)/100.0); //rounds off the answer to the 2nd decimal point.
        /* Explanation for Math.round:
        Why did I multiply by 100?

        1. It would move the decimal spots that I would like to save to the left of the decimal point
        2. Eliminates the remaining decimal spots by rounding up to a whole number
        3. Divide by 100 to push the two decimal spots to the right of the decimal point
        3.1. Adding the division after the bracket will prevent the new decimal values from being rounded

        If I multiply and divide by 10  it'll round up to the first decimal place
        If I multiply and divide by 100... to the 2nd decimal place
        By 1000... to the 3rd decimal place and so on
*/


    }
}