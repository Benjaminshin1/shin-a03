/*
 *  UCF COP3330 Fall 2021 Assignment 25 Solution
 *  Copyright 2021 Benjamin Shin
 */
/*
A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
If a password does not meet any of these rules, then report it as a password of unknown strength.
 */
package baseline;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class solution25 {
    public static final Scanner input = new Scanner(System.in);

    public String input_password(String prompt){
    //create a scanner function for the passwords
        System.out.println(prompt);
        return input.next();
    }
    public int passwordValidator(String password){
        //takes in password as its argument and returns value you can evaluate to determine the password strength.
        int length = password.length();
        return length;
    }
    public void check_password(String password, int password_length){
        //takes in the password string and the password length and goes through a number of check to determine password strength
        //outputs a statement of how strong your password is

        //checks if the password length is less than 8
        if(password_length<8){
            boolean weak = true;
        }else {
            boolean weak = false;
        }
        //checks the string if the password has uppercase and lowercase letters
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());

        //check to see if the password has only numbers
        if(!hasLowercase&&!hasUppercase&&password_length<8&&is_digit(password)) {
            //contains only numbers and is fewer than eight characters.
            System.out.println("The password '"+ password + "' is a very weak password.");
        }
        else if((hasLowercase||hasUppercase)&&!return_special(password)&&password_length<8&&!is_digit(password)){
            //contains only letters and is fewer than eight characters.
            System.out.println("The password '"+ password + "' is a weak password.");
        }
        else if((hasLowercase||hasUppercase)&&is_digit(password)&&password_length>=8&&!return_special(password)){
            //contains letters and at least one number and is at least eight characters.
            System.out.println("The password '"+ password + "' is a strong password.");
        }
        else if(return_special(password)&&(hasLowercase||hasUppercase)&&is_digit(password)&&password_length>=8){
            //contains letters, numbers, and special characters and is at least eight characters.
            System.out.println("The password '"+ password + "' is a very strong password.");
        }
        else
            //none of these conditions
            System.out.println("This is a password of unknown strength!");

    }

    public boolean return_special(String password) {
        //checks to see if there is a special character in the password

        //special includes all the special characters
        Pattern special = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = special.matcher(password);

        boolean status = m.find();

        return status;
    }

    public boolean is_digit(String password) {
        //checks to see if there is a number in the password
        Pattern digit = Pattern.compile(".*\\d.*");
        Matcher m = digit.matcher(password);

        boolean status = m.find();

        return status;
    }

    public static void main(String[] args) {
        solution25 app = new solution25();
        //Prompt user to enter a password
        String password = app.input_password("Enter a password to check the strength: ");

        //Pass the password into the validator to return the length
        int password_length = app.passwordValidator(password);

        app.check_password(password, password_length);

    }
}
