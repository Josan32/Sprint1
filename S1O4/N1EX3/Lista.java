package S1O4.N1EX3;

import java.util.ArrayList;

public class Lista {


    static void getlist(ArrayList numbersList, int index) {
        try {
            numbersList.add(1);
            numbersList.add(2);
            System.out.println(numbersList.get(index));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error");
        }
    }
    static int getlist2(ArrayList numbersList, int index) {
            numbersList.add(1);
            numbersList.add(2);
            return (int) numbersList.get(index);


    }
}




