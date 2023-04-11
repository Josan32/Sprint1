package S1O4.N1EX3;

import jdk.jfr.Name;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class ListaTest {

    @Test
    @Name("index out of bounds by asking a higher number than list size")
    void triggerError() {

        assertThrows(ArrayIndexOutOfBoundsException.class,()-> Lista.getList());
    }

}
