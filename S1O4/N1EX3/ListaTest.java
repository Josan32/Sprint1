package S1O4.N1EX3;

import S1O4.N1EX1.Month;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class ListaTest {

    ArrayList<Integer> listnumber = new ArrayList<>();


    @Test
    public void testGet(){
        try{
            Lista.getlist2(listnumber,1);

        }catch (IndexOutOfBoundsException e){
            System.out.println("Error");
        }
    }

}
