/*
 *  UCF COP3330 Fall 2021 Assignment 25 Solution
 *  Copyright 2021 Benjamin Shin
 */
/*
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
If a password does not meet any of these rules, then report it as a password of unknown strength.
Create a passwordValidator function that takes in the password as its argument and returns a numeric value you can evaluate to determine the password strength.
Use a single output statement.
 */
package baseline;

import java.util.Scanner;

public class solution25 {
    public static final Scanner input = new Scanner(System.in);

    public String input_password(String prompt){
    //create a scanner function for the passwords
        System.out.println(prompt);
        return input.next();
    }
    public int passwordValidator(String password){
        //takes in password as its argument and returns value you can evaluate to determine the password strength.
        return passwordValidator();
    }
    public void check_password(String password, int password_length){
        //takes in the password string and the password length and goes through a number of check to determine password strength
        //outputs a statement of how strong your password is
    }

    public static void main(String[] args) {

    }
}
