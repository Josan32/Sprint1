package S1O4.N1EX3;

import jdk.jfr.Name;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ListaTest {

    Integer[] list = {1,2,3};

    @Test
    @Name("index out of bounds by asking a higher number than list size")
    void triggerError2() {

        assertThrows(ArrayIndexOutOfBoundsException.class,()-> Lista.getList(list,8));
    }


}
