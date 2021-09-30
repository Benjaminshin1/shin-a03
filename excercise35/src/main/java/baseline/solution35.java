/*
 *  UCF COP3330 Fall 2021 Assignment 35 Solution
 *  Copyright 2021 Benjamin Shin
 */
package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class solution35 {
    public static final Scanner input = new Scanner(System.in);

    public void winner_list(){
        solution35 app = new solution35();
        List<String> potential_winner = new ArrayList();

        //Use a loop to capture user input into an array.
        boolean status= true;
        while(true){
            System.out.print("Enter a name: ");
            String name = input.nextLine();
            if (name.equals(" ")||name.equals("")){
                //break loop if user entered nothing
                break;
            }
            //keep adding users to the list
                potential_winner.add(name);
        }
        //generate a number based on how many people there are
        int winner=app.RNG(potential_winner.size());
        //output the winner based on the number
        System.out.println("The winner is... "+potential_winner.get(winner));
    }

    public int RNG(int number){
        Random rand = new Random();
        //Use a random number generator to pluck a value from the array.
       int winner=rand.nextInt(number);
        return winner;
    }

    public static void main(String[] args) {
        solution35 app = new solution35();
//call winner_list function to get the array list
        app.winner_list();

    }
}
