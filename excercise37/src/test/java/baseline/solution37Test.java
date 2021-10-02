package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class solution37Test {

    @Test
    void generate_password() {
        solution37 app =new solution37();
        ArrayList<Character> password = new ArrayList<>();
        int expected = 16;
        password = app.generate_password(16,4,4);
        int actual= password.size();
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void special_characters() {
        solution37 app =new solution37();
        ArrayList<Character> password = new ArrayList<>();
        int expected=10;
        password=app.special_characters(10,password,30);
        int actual = password.size();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void letters() {
        solution37 app =new solution37();
        ArrayList<Character> password = new ArrayList<>();
        int expected=20;
        password=app.letters(20,password);
        int actual = password.size();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void numbers() {
        solution37 app =new solution37();
        ArrayList<Character> password = new ArrayList<>();
        int expected=15;
        password=app.numbers(15,password,45);
        int actual = password.size();
        Assertions.assertEquals(expected,actual);
    }
}