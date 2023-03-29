package N2EX4;

import java.util.*;

public class App {
    public static void main(String[] args) {

        List<String> wordList = new ArrayList<>(List.of("Jonh", "dog","12345", "edamame", "50cnt","2"));

        //ORDERNAR ALFABETICAMENTE
        alphabeticalOrder(wordList);
        wordList.forEach(System.out::println);
        System.out.println("----------");

        //LOS STRINGS CON E PRIMERO
        wordList.sort(ePrimer());
        wordList.forEach(System.out::println);
        System.out.println("----------");

        //CAMBIAR A POR 4
        changeA(wordList).forEach(System.out::println);
        System.out.println("----------");

        // MOSTRAR SOLO STRING CON NUMEROS
        isNumeric(wordList);

    }

    public static void alphabeticalOrder(List<String> words){
        Collections.sort(words, (w1,w2) -> w1.compareTo(w2));
    }
    public static Comparator<String> ePrimer() {
        Comparator<String> comp = (s1, s2) -> {
            if (s1.contains("e")) {
                return -1;
            }
            else {
                return 0;
            }
        };
        return comp;
    }

    public static List<String> changeA(List<String> words){
        List<String> finalList = new ArrayList<>();
        words.forEach(s -> {
            if (s.contains("a")) {
                finalList.add(s.replace("a", "4"));
            }
            else{
                finalList.add(s);
            }
        });
        return finalList;
    }

    public static void isNumeric(List<String> words){
        words.forEach(s -> {
            if (s.matches("[0-9]*")) {
                System.out.println(s);
            }
        });
    }


}
