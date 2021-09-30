/*
 *  UCF COP3330 Fall 2021 Assignment 34 Solution
 *  Copyright 2021 Benjamin Shin
 */

/*
Create a small program that contains a list of employee names.
 */
package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution34 {
    public static final Scanner input = new Scanner(System.in);

    public String get_name() {
        //save the full name to compare it to an array of names
        //remove a name by comparing it to the users name that was inputted
        String name =input.nextLine();;
        return name;
    }

public List<String> names(){
        //hold the list of names
    List<String> names = new ArrayList();
    names.add("John Smith");
    names.add("Jackie Jackson");
    names.add("Chris Jones");
    names.add("Amanda Cullen");
    names.add("Jeremy Goodwin");
    return names;
}

public void remove_name(List<String> names,String name){
       int i=0;
        //compare the name to be removed and names in the list
    //remove the name and output how many names are in the list and the names
    names.remove(name);
    System.out.println("there are "+names.size()+" employees: ");
    for(i=0;i<names.size();i++) {
        System.out.println(names.get(i));
    }

}


    public static void main(String[] args) {
        solution34 app = new solution34();
        int i=0;
        //Prompt for an employee name and remove that specific name from the list of names.
        //Display the remaining employees, each on its own line.


        //Print out the list of names when the program runs the first time.
        List<String> names=app.names();
        System.out.println("there are "+names.size()+" employees: ");
        for(i=0;i<names.size();i++) {
            System.out.println(names.get(i));
        }
        //Prompt for an employee name and remove that specific name from the list of names.
        System.out.println("Enter an employee name to remove:");
        String name=app.get_name();

        //call the remove name function and print how many names are left
        app.remove_name(names,name);

    }
}
