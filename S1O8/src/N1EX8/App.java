package N1EX8;

public class App {
    public static void main(String[] args) {

        String word = "Hello";
        System.out.println("The word is: "+ word);

        Reverse wordsReverse = reverse();
        System.out.println("The reverse of word is: "+ wordsReverse.reverse(word));
    }

    public static Reverse reverse() {
        Reverse inv = (str) -> {
            String reverseWord = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverseWord += str.charAt(i);
            }
            return reverseWord;
        };
        return inv;
    }
}


