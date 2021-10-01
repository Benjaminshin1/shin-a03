package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculate() {
    PaymentCalculator app = new PaymentCalculator();
    Boolean actual;
    double number=app.calculate(12,5000,100);
    if(Math.ceil(number)==70.0){
         actual =true;
    }
    else {
        actual=false;
    }

    assertEquals(true,actual);




    }
}