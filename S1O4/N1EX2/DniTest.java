package S1O4.N1EX2;

import S1O4.N1EX1.Month;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DniTest {

    ArrayList<String>letterDni = new ArrayList<>();
    int dni = 53021197;
    int dni2 = 65004204;
    int dni3 = 11111111;


    @Test
    void testCalculLeterDni(){
        Dni.letterList(letterDni);
        String letter = Dni.calculLeterDni(dni2,letterDni);
        assertEquals("v", letter);
    }
}
