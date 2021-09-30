/*
 *  UCF COP3330 Fall 2021 Assignment 33 Solution
 *  Copyright 2021 Benjamin Shin
 */
/*
 */
package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class solution33 {
    public static final Scanner input = new Scanner(System.in);

    public int randomnumber(){
        //return a random number 1-4 to generate a random question
        int number=0;
        Random rand = new Random();
        number=rand.nextInt(4);
        return number;
    }

    public void give_wisdom(int number){
        solution33 app = new solution33();
        //give an answer based on the number generated
        //store the answers in an array
        List<String> wisdom = new ArrayList<>();

        // Adding new elements to the ArrayList
        wisdom.add("Yes");
        wisdom.add("No");
        wisdom.add("Maybe");
        wisdom.add("Ask again later.");
        //answer user using a randomly generated number generator to give a random answer
        System.out.println(wisdom.get(number));
    }

    public static void main(String[] args) {
        solution33 app = new solution33();

        //prompt user to ask for a question
        System.out.println("What is your question? :");
        String sentence = input.nextLine();

        app.give_wisdom(app.randomnumber());
    }
}
