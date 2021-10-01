package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
//The average is 400.0
//The minimum is 100
//The maximum is 1000
//The standard deviation is 353.55

class solution36Test {
    solution36 app = new solution36();

    public List<Float> array(){
        List<Float> number ;
        number = new ArrayList<Float>();
        number.add(100F);
        number.add(200F);
        number.add(1000F);
        number.add(300F);
        return number;
    }

    @Test
    void average() {
        solution36 app = new solution36();
        float expected= 400.0F;
        float actual = (float) app.average(array());
        Assertions.assertEquals(expected,actual);


    }

    @Test
    void max() {
        solution36 app = new solution36();
        float expected= 1000.0F;
        float actual = (float) app.max(array());
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void min() {
        solution36 app = new solution36();
        float expected= 100.0F;
        float actual = (float) app.min(array());
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void std() {
        solution36 app = new solution36();
        float expected= 353.5534F;
        float actual = (float) app.std(array());
        Assertions.assertEquals(expected,actual);
    }
}