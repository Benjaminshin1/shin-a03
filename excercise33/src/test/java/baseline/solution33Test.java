package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution33Test {

    @Test
    void randomnumber() {
        solution33 app = new solution33();
        int number=app.randomnumber();
        boolean actual = false;
        if(number>=0&&number<=4){
             actual=true;
        }
        else {
             actual=false;
        }
        
        boolean expected = true;
        assertEquals(expected, actual);
    }
}