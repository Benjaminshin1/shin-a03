/*
 *  UCF COP3330 Fall 2021 Assignment 40 Solutions
 *  Copyright 2021 Benjamin Shin
 */
package baseline;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    public final Scanner input = new Scanner(System.in);

    public String input_string(String prompt) {
        //create a scanner function for the inputs
        System.out.println(prompt);
        return input.next();
    }

    public static void main(String[] args) {
        solution40 app =new solution40();
        //array list of the entire employee record
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", "Johnson", "Manager", "2016-12-31"));
        employeeList.add(new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        employeeList.add(new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employeeList.add(new Employee("Jake", "Jacobson", "Programmer", ""));
        employeeList.add(new Employee("Jacquelyn", "Jackson", "DBA", ""));
        employeeList.add(new Employee("Sally", "Weber", "Web Developer", "2015-12-18"));

        //prompt user for a string to search the employee list for first or last
        String name= app.input_string("Enter a string to search: ");
        System.out.println("\nResults:\n");

        System.out.println("Name" + "                 |  " + "Position            | "+"separation date");
        System.out.println("---------------------|----------------------|----------------------");


        //structure will be the same as exercise 39
        for (Employee employee : employeeList) {
            //if the input string is equal to last or first
            if(employee.getFirst().contains(name)||employee.getLast().contains(name)){
                String format = "%1$-10s %2$-10s| %3$-20s | %4$-20s\n";
                System.out.format(format, employee.getFirst(), employee.getLast(), employee.getPosition(),employee.getSeparationDate());
                //output that employee list
            }
        }
    }
}
