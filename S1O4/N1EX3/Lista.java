package S1O4.N1EX3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista {


    public static List<String> addClients() throws ArrayIndexOutOfBoundsException {
        List<String> listClients = new ArrayList<>();
        //listClients.add("George");

        if (listClients.size() == 0) {
            throw new ArrayIndexOutOfBoundsException("Can't add more clients");
        }
        return listClients;
    }

}




