package S1O4.N1EX3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListaTest {

    List<String> listClients = new ArrayList<>();



    @Test
    void test(){
        assertTrue(listClients != null);
    }
}
