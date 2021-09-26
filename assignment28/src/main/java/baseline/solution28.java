package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 28 Solution
 *  Copyright 2021 Benjamin Shin
 */
//Write a program that prompts the user for five numbers and computes the total of the numbers.
//The prompting must use repetition, such as a counted loop, not three separate prompts.
/*
example
Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.
 */

import java.util.Scanner;

public class solution28 {
    public static final Scanner input = new Scanner(System.in);

    public void sum(){
        int i=0;
        //using a counted loop
        for(i=0;i<5;i++){
            //repeat the loop 5 times asking for an input
            
        }
    }

    public int input_int(String prompt){
        //create a scanner function for the number
        System.out.println(prompt);
        return input.nextInt();
    }

    public static void main(String[] args) {

    }
}
