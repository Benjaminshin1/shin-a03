/*
 *  UCF COP3330 Fall 2021 Assignment 27 Solution
 *  Copyright 2021 Benjamin Shin
 */
package baseline;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Large functions aren’t very usable or maintainable.
It makes a lot of sense to break down the logic of a program into smaller functions that do one thing each. The program can then call these functions in sequence to perform the work.

Use a single output statement to display the outputs.

Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234

The employee ID must be in the format of AA-1234.
The zipcode must be a 5 digit number.

Enter the first name: John
Enter the last name: Johnson
Enter the ZIP code: 55555
Enter the employee ID: TK-4321
There were no errors found.

 */
public class solution27 {
    public static final Scanner input = new Scanner(System.in);

    public String input_string(String prompt){
        //create a scanner function for the passwords
        System.out.println(prompt);
        return input.next();
    }

    public void validateInput(){
        solution27 app = new solution27();
        //takes in all of the input data and invokes the specific validation functions
        String first= app.input_string("Enter the first name: ");
        String last= app.input_string("Enter the last name: ");
        String zip= app.input_string("Enter the ZIP code: ");
        String ID= app.input_string("Enter the employee ID: ");

        //invoke all the validation functions
        Boolean status1=app.check_first(first);
        Boolean status2=app.check_last(last);
        Boolean status3=app.check_zip(zip);
        Boolean status4=app.check_ID(ID);

        //if all statements are true
        if(status1&&status2&&status3&&status4){
            //output no errors found if all inputs are correct
            System.out.println("There were no errors found.");
        }

    }

    public Boolean check_first(String first){
        //takes in first name and checks if it is valid
        if(first.length()<2){
            System.out.println("The first name must be at least 2 characters long.");
            return false;
        }else return true;
    }

    public Boolean check_last(String last){
        //takes in last name and checks if it is valid
        if(last.length()<2){
            System.out.println("The last name must be at least 2 characters long.");
            return false;
        }else if(last==""){
            System.out.println("The last name must be filled in");
            return false;
        }else return true;
    }

    public Boolean check_zip(String zip){

        //checks to see if they are numbers
        Pattern digit = Pattern.compile(".*\\d.*");
        Matcher d = digit.matcher(zip);
        boolean status = d.find();

        //checks to see if they have letters
        boolean hasUppercase = !zip.equals(zip.toLowerCase());
        boolean hasLowercase = !zip.equals(zip.toUpperCase());

        //less than 5 numbers, is a number, has letters
        if(zip.length()<5&&!status&&(hasLowercase||hasUppercase)){
            System.out.println("The zip code must be a 5 digit number.");
            return false;
        }else
            return true;
    }

    public Boolean check_ID(String ID){
        //An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
        boolean status = ID.matches("^([A-Z]{2})-(\\d{4}$)");
        if(!status){
            System.out.println("The employee ID must be in the format of AA-1234.");
            return false;
        }else
        return true;
    }

    public static void main(String[] args) {
        solution27 app = new solution27();
        app.validateInput();
    }
}
