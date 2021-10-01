package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 36 Solutions
 *  Copyright 2021 Benjamin Shin
 */
/*
Write a program that prompts for response times from a website in milliseconds. It should keep asking for values until the user enters “done.”

The program should print the average time (mean), the minimum time, the maximum time, and the population standard deviation.

Create functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.

Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.
 */

import java.util.Scanner;

public class solution36 {

    public static final Scanner input = new Scanner(System.in);



   // Create functions called average, max, min, and std, which take in a list of numbers and return the results.
    public double average(){
        //average of all the numbers combined
        double result = 0;
        return result;
    }

    public double max(){
        //max number of all the numbers
        double result = 0;
        return result;
    }

    public double min(){
        //the lowest number in the list
        double result = 0;
        return result;
    }

    public double std(){
        //standard deviation of all the numbers
        double result = 0;
        return result;
    }

    public double input_double(String prompt) {
        //create a scanner function for the inputs
        System.out.println(prompt);
        return input.nextDouble();
    }




    public static void main(String[] args) {
        //take in numbers until it is done
    }
}
