package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution25Test {

    @Test
    void passwordValidator() {
        solution25 app = new solution25();
        int expected = 8;
        int actual = app.passwordValidator("sb5njwk9");

        assertEquals(expected, actual, 8);
    }

    @Test
    void return_special() {
        solution25 app = new solution25();
        boolean actual = app.return_special("special!");
        assertEquals(true, actual);
    }

    @Test
    void is_digit() {
        solution25 app = new solution25();
        boolean actual = app.return_special("ben1");
        assertEquals(true, actual);
    }
}