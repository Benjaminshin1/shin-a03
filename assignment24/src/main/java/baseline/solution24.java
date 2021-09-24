/*
 *  UCF COP3330 Fall 2021 Assignment 24 Solutions
 *  Copyright 2021 Benjamin Shin
 */
/*
Create a program that compares two strings and determines if the two strings are anagrams.
Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false.
(don't forget to create functions outside of main!!)
 */
package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class solution24 {
    public static final Scanner input = new Scanner(System.in);

    public String input_string(String prompt) {
        //create a scanner function for the inputs
        System.out.println(prompt);
        return input.next();
    }
    public boolean isAnagram(String Anagram1, String Anagram2){
        //create a function that compare the two strings that are inputted and return an output statement if they are anagrams or not
        // convert strings to array
        char[] Array1 = Anagram1.toCharArray();
        char[] Array2 = Anagram2.toCharArray();
        // sort the array so that all letters are in the same position in ascending order
        Arrays.sort(Array1);
        Arrays.sort(Array2);

        boolean is_anagram = Arrays.equals(Array1, Array2);
        if(is_anagram){
            System.out.println(Anagram1 + " and "+ Anagram2 + " are anagrams.");
        }else
            System.out.println(Anagram1 + " and "+ Anagram2 + " are not anagrams.");
        return is_anagram;
    }

    public static void main(String[] args) {
        solution24 app = new solution24();
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        //Prompt user to enter two strings shown in the examples
        String Anagram1 = app.input_string("Enter the first string: ");
        String Anagram2 = app.input_string("Enter the second string: ");
        app.isAnagram(Anagram1,Anagram2);

    }
}
