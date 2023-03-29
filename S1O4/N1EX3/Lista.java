package S1O4.N1EX3;

import java.util.ArrayList;
import java.util.List;

public class Lista {


    public static int getList(int num){
            List<Integer> numberList = new ArrayList<>(List.of(1,2,34));
            int index = -1;
        try{
            index = numberList.get(num);

        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        return index;
    }

}




