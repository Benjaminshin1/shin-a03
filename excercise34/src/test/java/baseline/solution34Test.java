package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class solution34Test {

    @Test
    void remove_name() {
        solution34 app = new solution34();
        ArrayList<String> names=new ArrayList();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        app.remove_name(names,"John Smith");
        boolean actual;
        if(names.size()==4){
             actual =true;
        }
        else {
             actual=false;
        }
        Assertions.assertEquals(true,actual);
    }
}