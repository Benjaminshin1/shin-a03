/*
 *  UCF COP3330 Fall 2021 Assignment 27 Solution
 *  Copyright 2021 Benjamin Shin
 */
package baseline;

import java.util.Scanner;

/*
Large functions aren’t very usable or maintainable. It makes a lot of sense to break down the logic of a program into smaller functions that do one thing each. The program can then call these functions in sequence to perform the work.


Display appropriate error messages on incorrect data.

Use a single output statement to display the outputs.

Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234
The first name must be at least 2 characters long.
The last name must be at least 2 characters long.
The last name must be filled in.
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
        String first;
        String last;
        String zip;
        String ID;
        Boolean status;
        //invoke all the validation functions
        status=app.check_first(first);
        status=app.check_last(last);
        status=app.check_zip(zip);
        status=app.check_ID(ID);

        if(status == true){
            //output no errors found if all inputs are correct
        }

    }

    public Boolean check_first(String first){
        //takes in first name and checks if it is valid
        Boolean status;
        return status;
    }

    public Boolean check_last(String last){
        //takes in last name and checks if it is valid
    }

    public Boolean check_zip(String zip){
        //The zipcode must be a 5 digit number.
    }

    public Boolean check_ID(String ID){
        //An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
    }

    public static void main(String[] args) {
        solution27 app = new solution27();
    }
}
