/*
 *  UCF COP3330 Fall 2021 Assignment 31 Solution
 *  Copyright 2021 Benjamin Shin
 */

package baseline;

import java.util.Scanner;

public class solution31 {
    public static final Scanner input = new Scanner(System.in);

    public int input_int() {
        //create a scanner function for the numbers
        //won't let user enter a letter
        while (!input.hasNextInt()) input.next();
        return input.nextInt();
    }

    public void loop(int age, int restingHR) {
        //using a loop generate a table using the results from the formula
        int intensity = 55;
        while (intensity <= 95) {
            //typecast to get proper values
            double p=(double)intensity/100;
            //The formula is TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
            double Target = (((220 - age) - restingHR) * p) + restingHR;
            System.out.println(intensity + "%       | " + (int)Target + "bpm");
            //add 5 to intensity each loop
            intensity += 5;
        }
    }
        public static void main (String[]args){
            solution31 app = new solution31();

            //ask user for age number
            System.out.println("Enter your age: ");
            int age = app.input_int();

            //ask user for heart rate
            System.out.print("Enter your resting heart rate: ");
            int restingHR = app.input_int();


            //print format
            System.out.println("Resting Pulse: " + restingHR + " Age: " + age);
            System.out.println("Intensity | Rate ");
            System.out.println("------------------------");
            app.loop(age,restingHR);
        }
    }
