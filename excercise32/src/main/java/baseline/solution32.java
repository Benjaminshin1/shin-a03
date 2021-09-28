/*
 *  UCF COP3330 Fall 2021 Assignment 32 Solution
 *  Copyright 2021 Benjamin Shin
 */
package baseline;

import java.util.Scanner;

public class solution32 {
    //set a global count for each wrong guess number or not
    public static int count = 0;
    public static final Scanner input = new Scanner(System.in);

    public int numberguess(int level){
        int number=0;
        //generate a number based on the level 1 2 or 3
        //The computer picks a random number in that range

        //The first level of difficulty would be a number between 1 and 10.
        //The second difficulty set would be between 1 and 100.
        //The third difficulty set would be between 1 and 1000.
        return number;
    }

    public void guess(int number){
        //The computer picks a random number in that range and prompts the player to guess that number.
        //Each time the player guesses, the computer should give the player a hint as to whether the number is too high or too low.
        //The computer should also keep track of the number of guesses. Once the player guesses the correct number,
        //the computer should present the number of guesses and ask if the player would like to play again.
    }

    public int input_int() {
        //create a scanner function for the numbers
        //won't let user enter a letter
        while (!input.hasNextInt()){
            ++count;
            input.next();
        }
        return input.nextInt();
    }
    public static void main(String[] args) {
        //Prompt for the difficulty level, and then start the game.

    }
}
