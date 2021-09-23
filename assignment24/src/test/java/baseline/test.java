package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class test {
    private boolean isAnagram(String Anagram1, String Anagram2){
        //create a function that compare the two strings that are inputted and return an output statement if they are anagrams or not
        // convert strings to array
        char[] Array1 = Anagram1.toCharArray();
        char[] Array2 = Anagram2.toCharArray();
        // sort the array so that all letters are in the same position in ascending order
        Arrays.sort(Array1);
        Arrays.sort(Array2);

        boolean is_anagram = Arrays.equals(Array1, Array2);
        if(is_anagram){
            System.out.println(Anagram1 + " and "+ Anagram2 + " are anagrams.");

        }else
            System.out.println(Anagram1 + " and "+ Anagram2 + " are not anagrams.");
        return is_anagram;
    }

    @Test
    public void anagramTest() {
        Assertions.assertTrue(isAnagram("toad", "toda"));
    }
    @Test
    public void if_false() {
        Assertions.assertFalse(isAnagram("toad", "todo"));
    }
    }

