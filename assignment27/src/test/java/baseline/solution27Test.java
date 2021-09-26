package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution27Test {

    @Test
    void check_first() {
        solution27 app = new solution27();
        boolean actual = app.check_first("ben");
        assertEquals(true, actual);
    }

    @Test
    void check_last() {
        solution27 app = new solution27();
        boolean actual = app.check_last("shin");
        assertEquals(true, actual);
    }

    @Test
    void check_zip() {
        solution27 app = new solution27();
        boolean actual = app.check_zip("12345");
        assertEquals(true, actual);
    }

    @Test
    void check_ID() {
        solution27 app = new solution27();
        boolean actual = app.check_ID("AA-1234");
        assertEquals(true, actual);
    }
}