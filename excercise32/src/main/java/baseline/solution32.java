/*
 *  UCF COP3330 Fall 2021 Assignment 32 Solution
 *  Copyright 2021 Benjamin Shin
 */
package baseline;

import java.util.Random;
import java.util.Scanner;

public class solution32 {
    //set a global count for each wrong guess number or not
    public static int count = 0;


    public static final Scanner input = new Scanner(System.in);

    public int numberguess(int level){
        int number=0;
        Random rand = new Random();
        //generate a number based on the level 1 2 or 3
        //The computer picks a random number in that range
        if(level==1){
            //The first level of difficulty would be a number between 1 and 10.
            number=rand.nextInt(10)+1;
        }
        else if(level==2){
            //The second difficulty set would be between 1 and 100.
            number=rand.nextInt(100)+1;
        }else if(level==3){
            //The third difficulty set would be between 1 and 1000.
            number=rand.nextInt(1000)+1;
        }
        return number;
    }

    public void guess(int guess_number){
        solution32 app = new solution32();
        //The computer should also keep track of the number of guesses. Once the player guesses the correct number
        System.out.println("I have my number. What's your guess?");
        int guess = app.input_guess();
        boolean status =true;

        do {
            if (guess == guess_number) {
                ++count;
                System.out.println("You got it in " + count + " guesses!");
                status = false;
            } else if (guess > guess_number) {
                ++count;
                System.out.println("Too high, Guess again.");
                guess = app.input_guess();
            } else if (guess < guess_number) {
                ++count;
                System.out.println("Too low. Guess again");
                guess = app.input_guess();
            }
        }while(status);
    }

    public int input_int() {
        //create a scanner function for the numbers
        //won't let user enter a letter
        while (!input.hasNextInt()){
            input.next();
        }
        return input.nextInt();
    }

    public String input_string() {
        //scanner for yes or no
        return input.next();
    }

    public int input_guess() {
        //create a scanner function for the guess
        //won't let user enter a letter
        //count for wrong input also
        while (!input.hasNextInt()){
            System.out.println("guess is not a number.");
            ++count;
            input.next();
        }
        return input.nextInt();
    }


    public static void main(String[] args) {
        solution32 app = new solution32();
        while(true) {
            //Prompt for the difficulty level, and then start the game.
            System.out.println("Enter the difficulty level (1, 2, or 3): ");
            //return the level number
            int level = app.input_int();

            //return the randomly generated number based off of the level
            int randnumber = app.numberguess(level);

            //start the game.
            app.guess(randnumber);

            //the computer should present the number of guesses and ask if the player would like to play again.
            System.out.println("Do you wish to play again (Y/N)?");
            String play=app.input_string();
            //restarts the game or ends it
            if(play.equals("Y")){
            }
            else break;
        }
    }
}
