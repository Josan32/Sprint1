package N2EX1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>(List.of("Abel", "Ana", "Pedro", "Ann", "Php"));

        newList(words).forEach(System.out::println);
    }
    public static List<String> newList (List<String> words){
        char letter = 'A';
        return words.stream().filter(s -> s.charAt(0) == letter && s.length()==3).toList();
    }

}
