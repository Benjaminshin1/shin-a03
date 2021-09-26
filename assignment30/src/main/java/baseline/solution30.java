/*
 *  UCF COP3330 Fall 2021 Assignment 30 Solution
 *  Copyright 2021 Benjamin Shin
 */

package baseline;

import java.util.Scanner;

public class solution30 {
    public static final Scanner input = new Scanner(System.in);
    
    public void create_table() {
        //create a 12 by 12 table
        int i;
        int j;
        //Use a nested loop to complete this program.
        for (i = 1; i <= 12; ++i) {
            for (j = 1; j <= 12; ++j) {
                //multiply and print the numbers using %4d to tidy up the format
                System.out.printf("%4d", (i*j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solution30 app = new solution30();
        //call the multiplication table
        app.create_table();
    }
}
