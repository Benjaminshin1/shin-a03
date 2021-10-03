/*
 *  UCF COP3330 Fall 2021 Assignment 40 Solutions
 *  Copyright 2021 Benjamin Shin
 */
package baseline;


import java.util.ArrayList;
import java.util.List;

//constructor
class Employee {
    public String first;
    public String last;
    public String position;
    public String separationDate;

    public Employee(String first, String last, String position, String separationDate) {
        this.first = first;
        this.last = last;
        this.position = position;
        this.separationDate = separationDate;
    }
    public String getFirst() {
        return first;
    }
    public String getLast() {
        return last;
    }
    public String getPosition() {
        return position;
    }
    public String getSeparationDate() {
        return separationDate;
    }
}

public class solution40 {
    public static void main(String[] args) {
        //array list of the entire employee record
        List<Employee> employeeList = new ArrayList<>();


        //structure will be the same as exercise 39
        for (Employee employee : employeeList) {
            if(name==last or first){
                //output that employee list
            }
        }
    }
}
