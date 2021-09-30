package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class solution35Test {

    @Test
    void RNG() {
        boolean actual;
        boolean expected=true;
        solution35 app = new solution35();
        List<String> potential_winner = new ArrayList();
        potential_winner.add("james");
        potential_winner.add("tool");
        potential_winner.add("ben");
        potential_winner.add("hart");
        potential_winner.add("bart");
        potential_winner.add("corn");
        int number=app.RNG(potential_winner.size());

        if(number<6&&number>=0){
             actual=true;
        }else {
             actual=false;
        }

        Assertions.assertEquals(true,actual);

    }
}