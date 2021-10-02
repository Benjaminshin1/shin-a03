/*
 *  UCF COP3330 Fall 2021 Assignment 37 Solutions
 *  Copyright 2021 Benjamin Shin
 */
/*
Create a program that generates a secure password.
Ensure that the generated password is random.
 */
package baseline;
import java.util.ArrayList;
import java.util.Scanner;

public class solution37 {

    public final Scanner input = new Scanner(System.in);

    public void generate_password(int length, int num_special, int num_numbers){
        //generate a password for the user using those inputs.

        //this is the array to save the generated password
        ArrayList<Character> password = new ArrayList<>();


        //Ensure that there are at least as many letters are there are special characters and number.
    }

    public void special_characters(){
        //list of special characters
    }

    public void letters(){
        //list of letters
    }

    public void numbers(){
        //list of numbers
    }

    public int input_double(String prompt) {
        //create a scanner function for the inputs
        System.out.println(prompt);
        return input.nextInt();
    }


    public static void main(String[] args) {
//Prompt the user for the minimum length,
        int length;
//the number of special characters,
        int num_special;
//and the number of numbers.
        int num_numbers;
    }
}
