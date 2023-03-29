package S1O4.N1EX1;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MonthTest {

    ArrayList<String> monthsList = new ArrayList<>();


    @Test
    void testSiceList(){
        Month.insertMonths(monthsList);
        assertEquals(12, monthsList.size());
    }

    @Test
    void testGet8(){
        Month.insertMonths(monthsList);
        assertEquals("Agosto",monthsList.get(7) );
    }

    @Test
    void testIsNotNull(){
        Month.insertMonths(monthsList);
        assertNotNull(monthsList);
    }






}
