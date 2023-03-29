package S1O4.N1EX2;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

public class DniTest {

    @ParameterizedTest
    @CsvSource({
            "53287342, E",
            "38536723, Q",
            "47443128, Q",
            "89467241, R",
            "13469758, S",
            "69745915, W",
            "65478932, W",
            "74123698, B",
            "36987412, P",
            "65478912, M"
    })

    void test(String num, char letter){
        Dni dniTest = new Dni();
        String letterNew = dniTest.calculLeterDni(num);
        assertEquals(letter, letterNew);
    }
}
