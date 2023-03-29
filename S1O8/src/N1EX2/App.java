package N1EX2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Java", "Python", "Go", "Kotlin", "Php"));
        String letter = "o";

        List<String> finalList = filterList(words, letter);
        System.out.println(finalList);

    }
    public static List<String > filterList(List<String> originalList, String letter){
        return originalList.stream().filter(s -> (s.contains(letter)) && (s.length()>5)).toList();
    }
}
