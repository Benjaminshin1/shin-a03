/*
 *  UCF COP3330 Fall 2021 Assignment 26 Solutions
 *  Copyright 2021 Benjamin Shin
 */

/*

Write a program that will help you determine how many months it will take to pay off a credit card balance.
The program should ask the user to enter the balance of a credit card, the APR of the card, and their monthly payment.
The program should then return the number of months needed (rounded up to the next integer value).

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

public class PaymentCalculator {
    public static final Scanner input = new Scanner(System.in);

    public void calculateMonthsUntilPaidOff() {
        //takes no parameters and returns the number of months.

        //n is the number of months.
        int n=0;
        //i is the daily rate (APR divided by 365).
        float i;
        //b is the balance.
        float b;
        //p is the monthly payment.
        int p;
    }

    public int calculate(int n,int i,float b, int p){
        //calculate how many months it will take and return the value
        return n;
    }

    public float return_APR(float APR){
        float i;
        //i is the daily rate (APR divided by 365).
        return APR;
    }



    public String input_string(String prompt) {
        //create a scanner function for the inputs
        System.out.println(prompt);
        return input.next();
    }
    public float input_float(String prompt) {
        //create a scanner function for the inputs
        System.out.println(prompt);
        return input.nextFloat();
    }

    public static void main(String[] args) {
        PaymentCalculator app = new PaymentCalculator();
        app.calculateMonthsUntilPaidOff();

    }
}
