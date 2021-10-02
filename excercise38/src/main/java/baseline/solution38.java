/*
 *  UCF COP3330 Fall 2021 Assignment 38 Solution
 *  Copyright 2021 Benjamin Shin
 */
package baseline;

import java.util.ArrayList;
import java.util.Scanner;

//constraints
//Convert the input to an array. Many languages can easily convert strings to arrays with a built-in function that splits apart a string based on a specified delimiter.
//Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
//Use a function called filterEvenNumbers to encapsulate the logic for this. The function takes in the original array and returns the new array.

public class solution38 {

    public final Scanner input = new Scanner(System.in);

    public ArrayList<Character> filterEvenNumbers(ArrayList numbers){
        ArrayList<Character> even_numbers = new ArrayList<>();
        //Create a program that prompts for a list of numbers, separated by spaces. Have the program print out a new list containing only the even numbers.

        return even_numbers;
    }

    public ArrayList get_numbers(){
        //this is the array to save the numbers
        ArrayList<Character> numbers = new ArrayList<>();


        return numbers;
    }


    public static void main(String[] args) {
        solution38 app =new solution38();

        //prompt user for a list of numbers

        //output the even numbers
        System.out.println("The even numbers are "+ app.filterEvenNumbers(app.get_numbers()));
    }
}
