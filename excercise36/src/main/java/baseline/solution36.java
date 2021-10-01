package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 36 Solutions
 *  Copyright 2021 Benjamin Shin
 */


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution36 {

    public final Scanner input = new Scanner(System.in);



   // Create functions called average, max, min, and std, which take in a list of numbers and return the results.
    public double average(List number){
        //average of all the numbers combined
        //add all numbers and then divide by how many numbers there are
        int i=0;
        double result = 0.0;
        for (i=0;i<number.size();i++) {
            result += (Float)number.get(i);
        }
        result=result/number.size();
        return result;
    }

    public double max(List number){
        //max number of all the numbers
        //compares all the numbers to each other and compare and keep replacing with the highest number
        float max=0;
        int i=0;
        for (i=0;i<number.size();i++) {
            if(max<(Float)number.get(i)) {
                max = (Float) number.get(i);
            }
        }
        return max;
    }

    public double min(List number){
        //the lowest number in the list
        float min=1000000000;
        int i=0;
        for (i=0;i<number.size();i++) {
            if(min>(Float)number.get(i)) {
                min = (Float) number.get(i);
            }
        }
        return min;
    }

    public double std(List number){
        //standard deviation of all the numbers
        int i=0;
        double mean = 0.0;
        double result;
        float standardDeviation = 0;
        //standard deviation formula
        for (i=0;i<number.size();i++) {
            mean += (Float)number.get(i);
        }
        mean=mean/number.size();
        for (i = 0; i < number.size(); i++) {
            float temp=(Float)number.get(i);
           standardDeviation += Math.pow(( temp-mean), 2);
        }

       float sq = (standardDeviation / number.size());
        result = Math.sqrt(sq);
        //returns standard deviation
        return result;

    }


    public List<Float> return_array(){
        ArrayList<Float> number ;
        number = new ArrayList<Float>();
        String user_number;
        int num=0;
        //keeps adding until done
        while(true) {
            System.out.print("Enter a number: ");
            user_number = input.nextLine();
            if(user_number.equals("done"))
            {break;
            } else
            {
                //ignore any invalid inputs.
                num = 1;
                for(int i=0;i<user_number.length();i++) {
                    //checks if valid
                    if(Character.isDigit(user_number.charAt(i)))
                    {
                    }
                    else {
                        num = 0;
                    }
                }if(num==1)
                {
                    //adds the number to the list if valid
                    number.add((float) Integer.parseInt(user_number));
                }
            }
        }
        return number;
    }




    public static void main(String[] args) {
        solution36 app = new solution36();
        List<Float> number ;
        //take in numbers until it is done
        number= app.return_array();
        DecimalFormat f = new DecimalFormat("##.00");
        //prints the average
        System.out.println("The average is "+f.format(app.average(number)));
        //prints the minimum
        System.out.println("The minimum is "+ f.format(app.min(number)));
        //prints the max
        System.out.println("The maximum is "+f.format(app.max(number)));
        //prints the standard deviation
        System.out.print("The standard deviation is " +f.format(app.std(number)));
    }
}
