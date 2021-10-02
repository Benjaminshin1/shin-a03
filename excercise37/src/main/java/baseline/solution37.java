/*
 *  UCF COP3330 Fall 2021 Assignment 37 Solutions
 *  Copyright 2021 Benjamin Shin
 */
/*
Create a program that generates a secure password.
Ensure that the generated password is random.
 */
package baseline;
import java.util.*;

public class solution37 {

    public final Scanner input = new Scanner(System.in);


    public ArrayList<Character> generate_password(int length, int num_special, int num_numbers){
        solution37 app =new solution37();
        int i=0;
        //generate a password for the user using those inputs.

        //this is the array to save the generated password
        ArrayList<Character> password = new ArrayList<>();

        //Ensure that there are at least as many letters are there are special characters and number.
        password=app.special_characters(num_special,password,length);

        password=app.numbers(num_numbers,password,length);

        password=app.letters(length,password);

        //shuffle password before printing using rng
        Collections.shuffle(password);

        System.out.println("Your password is "+password.toString().replace("[","").replace("]","").replace(",","").replace(" ",""));
        return password;
    }

    public ArrayList special_characters(int num_special, ArrayList password,int length){
        int i=0;
        //makes sure the length of letters is at least half of the array
        if(num_special>length/3){
            num_special=length/3;
        }
        Random rand = new Random();
        //list of special characters
        String specialCharacters = "!@#$%^&*";

        for(i=0;i<num_special;i++){
            //add random special characters to the array
            password.add(specialCharacters.charAt(rand.nextInt(specialCharacters.length())));
        }
        return password;
    }

    public ArrayList letters(int length, ArrayList password){
        int i=0;
        //list of special characters
        Random rand = new Random();
        //list of letters
        String letters = "abcdefghijklmnopqrstuvwxyz";

        for(i=password.size();i<length;i++){
            //add the rest random letters to the array up to the length
            password.add(letters.charAt(rand.nextInt(letters.length())));
        }
        return password;
    }

    public ArrayList numbers(int num_numbers, ArrayList password,int length){
        //makes sure the length of letters is at least half of the array
        if(num_numbers>length/3){
            num_numbers=length/3;
        }
        int i=0;
        Random rand = new Random();
        //list of numbers
        String numbers = "1234567890";

        for(i=0;i<num_numbers;i++){
            //add random letters to the array
            password.add(numbers.charAt(rand.nextInt(numbers.length())));
        }
        return password;
    }

    public int input_int(String prompt) {
        //create a scanner function for the inputs
        System.out.println(prompt);
        return input.nextInt();
    }

    public static void main(String[] args) {
        solution37 app =new solution37();
//Prompt the user for the minimum length,
        int length=app.input_int("What's the minimum length?");
//the number of special characters,
        int num_special=app.input_int("How many special characters?");
//and the number of numbers.
        int num_numbers=app.input_int("How many numbers?");

        app.generate_password(length,num_special,num_numbers);
    }
}
