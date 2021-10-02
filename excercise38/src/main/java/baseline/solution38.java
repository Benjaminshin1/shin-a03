/*
 *  UCF COP3330 Fall 2021 Assignment 38 Solution
 *  Copyright 2021 Benjamin Shin
 */
package baseline;

import java.util.ArrayList;
import java.util.Scanner;



public class solution38 {

    public final Scanner input = new Scanner(System.in);

    public ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> numbers){
        int i=0;
        //if the remainder is 0 then add to new array and return that
        ArrayList<Integer> even_numbers = new ArrayList<>();
        for(i=0;i< numbers.size();i++){
            if((numbers.get(i) % 2) == 0){
                even_numbers.add(numbers.get(i));
            }
        }

        return even_numbers;
    }

    public ArrayList get_numbers(){
        int i=0;
        //this is the array to save the numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        String temp[]= input.nextLine().split(" ");
        for(i=0;i<temp.length;i++){
            numbers.add(Integer.parseInt(temp[i]));
        }
        return numbers;
    }


    public static void main(String[] args) {
        solution38 app =new solution38();
        //prompt user for a list of numbers
        System.out.println("Enter a list of numbers, separated by spaces: ");

        //output the even numbers removing the brackets, commas
        System.out.println("The even numbers are "+ app.filterEvenNumbers(app.get_numbers()).toString().replace("[","").replace("]","").replace(",",""));

    }
}
