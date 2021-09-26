package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 29 Solution
 *  Copyright 2021 Benjamin Shin
 */
/*
Write a quick calculator that prompts for the rate of return on an investment and calculates how many years it will take to double your investment.

example
What is the rate of return? 0
Sorry. That's not a valid input.
What is the rate of return? ABC
Sorry. That's not a valid input.
What is the rate of return? 4
It will take 18 years to double your initial investment.
 */

import java.util.Scanner;

public class solution29 {
    public static final Scanner input = new Scanner(System.in);
    public void calculate(){
        //years = 72 / r
        //where r is the stated rate of return.
    }

    public int input_int(String prompt){
        //create a scanner function for the rate of return
        System.out.println(prompt);
        return input.nextInt();
    }

    public static void main(String[] args) {

    }
}
