package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class solution38Test {

    @Test
    void filterEvenNumbers() {
        boolean actual = false;
        int i=0;
        solution38 app =new solution38();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> even_numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(111);
        numbers.add(22);
        numbers.add(33);
        numbers.add(15);
        numbers.add(10);

        even_numbers=app.filterEvenNumbers(numbers);
        for(i=0;i< even_numbers.size();i++){
            if((even_numbers.get(i) % 2) == 0){
                actual=true;
            }else {
                actual = false;
                break;
            }
        }
        Assertions.assertEquals(true,actual);
    }
}