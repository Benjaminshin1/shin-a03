/*
 *  UCF COP3330 Fall 2021 Assignment 24 Solutions
 *  Copyright 2021 Benjamin Shin
 */
/*
Create a program that compares two strings and determines if the two strings are anagrams.
Prompt user to enter two strings shown in the examples
Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false.
(don't forget to create functions outside of main!!)
create a scanner function for the inputs
create a function that compare the two strings that are inputted and return an output statement if they are anagrams or not
using the function isAnagram

 */
package baseline;

import java.util.Scanner;

public class solution24 {
    private static final Scanner input = new Scanner(System.in);

    private String input_string(String prompt) {
        System.out.println(prompt);
        return input.next();
    }
    private void anagram(){

    }

    public static void main(String[] args) {

    }
}
