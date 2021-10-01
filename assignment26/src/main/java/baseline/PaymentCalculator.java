/*
 *  UCF COP3330 Fall 2021 Assignment 26 Solutions
 *  Copyright 2021 Benjamin Shin
 */

/*

The formula for this is
    n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)

example output
What is your balance? 5000
What is the APR on the card (as a percent)? 12
What is the monthly payment you can make? 100
It will take you 70 months to pay off this card.

Prompt for the card’s APR. Do the division internally.
Prompt for the APR as a percentage, not a decimal.
Use a class called PaymentCalculator with a public method called calculateMonthsUntilPaidOff, which takes no parameters and returns the number of months.
Round fractions of a cent up to the next cent for internal calculations

 */
package baseline;

import java.util.Scanner;
import static java.lang.Math.log;

public class PaymentCalculator {
    public static final Scanner input = new Scanner(System.in);

    public void calculateMonthsUntilPaidOff() {
        PaymentCalculator app = new PaymentCalculator();
        //takes no parameters and returns the number of months.

        //b is the balance.
        double b=app.input_double("What is your balance?");
        //n is the number of months.
        double n;
        //i is the daily rate (APR divided by 365).
        double i=app.input_double("What is the APR on the card (as a percent)?");

        //p is the monthly payment.
        double p= app.input_double("What is the monthly payment you can make?");
        n=app.calculate(i,b,p);
        System.out.println("It will take you " + Math.ceil(n)+ " months to pay off this card.");
    }

    public double calculate(double i,double b, double p){
        //calculate how many months it will take and return the value
        double n;
        i=(i/365)/100;
        //didnt work until i used decimals for 1/30
        n =(-1.0/30.0) * Math.log(1 + ((b/p) * (1 - (Math.pow((1 + i), 30)))));
        n=n/Math.log(1 + i);
        return n;
    }

    public double input_double(String prompt) {
        //create a scanner function for the inputs
        System.out.println(prompt);
        return input.nextDouble();
    }

    public static void main(String[] args) {
        PaymentCalculator app = new PaymentCalculator();
        app.calculateMonthsUntilPaidOff();

    }
}
