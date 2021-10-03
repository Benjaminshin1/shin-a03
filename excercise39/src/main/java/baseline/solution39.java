/*
 *  UCF COP3330 Fall 2021 Assignment 39 Solutions
 *  Copyright 2021 Benjamin Shin
 */
/*
Given the following data set, create a program that sorts all employees by last name and prints them to the screen in a tabular format.

example output
Name                | Position          | Separation Date
--------------------|-------------------|----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |
John Johnson        | Manager           | 2016-12-31
Michaela Michaelson | District Manager  | 2015-12-19
Sally Weber         | Web Developer     | 2015-12-18
Tou Xiong           | Software Engineer | 2016-10-05

Store the data using a list of maps.
 */
package baseline;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String first;
    private String last;
    private String position;
    private String separationDate;

    public Employee(String first, String last, String position, String separationDate) {
        this.first = first;
        this.last = last;
        this.position = position;
        this.separationDate = separationDate;
    }

}

public class solution39 {

    public void compare(){
        //compare employee last name to sort
    }

    public static void main(String[] args) {
        //array list of the entire employee record
        List<Employee> employeeList = new ArrayList<>();
    }
}
