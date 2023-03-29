package N1EX6;

import java.util.ArrayList;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Java", "Python", "Jon", "Philips","un", "a", "1"));
        words.sort((s, s2) -> s.length() - s2.length());
        words.forEach(System.out::println);

    }
}
