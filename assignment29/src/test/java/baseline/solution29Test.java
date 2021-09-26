package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution29Test {

    @Test
    void calculate() {
        solution29 app = new solution29();
        int actual = app.calculate(4);
        int expected = 18;
        assertEquals(expected, actual);
    }
}