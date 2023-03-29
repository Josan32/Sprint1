package N2EX2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(3, 55, 44));

        System.out.println(changeList(list));

    }
    public static List<String> changeList(List<Integer> numList){
        List<String> words = new ArrayList<>();
        numList.forEach(s ->{
            if (s % 2 == 0){
                words.add("e"+s);
            }
            else{
                words.add("o"+s);
            }
        });
        return words;
    }
}
