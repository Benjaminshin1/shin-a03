package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution24Test {

    @Test
    void isAnagram() {
        solution24 app = new solution24();
        //boolean is true or false
        boolean expected = app.isAnagram("hello","olleh");
        assertEquals(expected,true);
    }
}