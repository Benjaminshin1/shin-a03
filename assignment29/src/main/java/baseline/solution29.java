package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 29 Solution
 *  Copyright 2021 Benjamin Shin
 */
/*
Write a quick calculator that prompts for the rate of return on an investment and calculates how many years it will take to double your investment.
 */

import java.util.Scanner;

public class solution29 {
    public static final Scanner input = new Scanner(System.in);

    public int calculate(int r) {
        int years = 72 / r;
        //where r is the stated rate of return.
        return years;
    }

    public String input_string(String prompt) {
        //create a scanner function for the rate of return
        System.out.println(prompt);
        return input.next();
    }

    public int loop() {
        int r = 0;
        solution29 app = new solution29();
        boolean status = true;

        //repeats if status is true
        while (status) {
            String n = app.input_string("");

            for (int i = 0; i < n.length(); i++) {

                //If we find a non-digit character we return true.
                if (!Character.isDigit(n.charAt(i))) {
                    status = true;
                } else
                    //change value to int
                    r = Integer.parseInt(n);
            }

                if (r<1) {
                    //checks value if greater than 0
                    //if it is break loop
                    System.out.println("enter a valid number.");
                    status = true;
                } else break;
            }
        return r;
        }

        public static void main (String[]args){
            solution29 app = new solution29();

            System.out.println("What is the rate of return?");
            int r = app.loop();
            int month= app.calculate(r);
            System.out.println("It will take "+month+" years to double your initial investment.");

        }
    }

