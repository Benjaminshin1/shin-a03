/*
 *  UCF COP3330 Fall 2021 Assignment 39 Solutions
 *  Copyright 2021 Benjamin Shin
 */
package baseline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
//A comparison function, which imposes a total ordering on some collection of objects.
// Comparators can be passed to a sort method (such as Collections.sort or Arrays.sort) to allow precise control over the sort order.
// Comparators can also be used to control the order of certain data structures (such as sorted sets or sorted maps),
// or to provide an ordering for collections of objects that don't have a natural ordering.
class sortlastname implements Comparator<Employee> {
    @Override
    public int compare(Employee one, Employee two) {
        return one.getLast().compareTo(two.getLast());
    }
}


public class solution39 {

    public static void main(String[] args) {
        //array list of the entire employee record
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", "Johnson", "Manager", "2016-12-31"));
        employeeList.add(new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        employeeList.add(new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employeeList.add(new Employee("Jake", "Jacobson", "Programmer", ""));
        employeeList.add(new Employee("Jacquelyn", "Jackson", "DBA", ""));
        employeeList.add(new Employee("Sally", "Weber", "Web Developer", "2015-12-18"));

        Collections.sort(employeeList, new sortlastname());

        //format of name and position and separation date
        System.out.println("Name" + "                 |  " + "Position            | "+"separation date");
        System.out.println("---------------------|----------------------|----------------------");

        //uses a loop to print employee data
        for (Employee employee : employeeList) {
            //%1 2 3 and 4 represent the .get
            String format = "%1$-10s %2$-10s| %3$-20s | %4$-20s\n";
            System.out.format(format, employee.getFirst(), employee.getLast(), employee.getPosition(),employee.getSeparationDate());


        }
    }
}
