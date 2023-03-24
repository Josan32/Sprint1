package N1EX2;

public class App {
    public static void main(String[] args) {

        Person pers1 = new Person("John", "Hatson", 99);
        String word = "Welcome";
        int numFavorite = 14;

        GenericMethods.printElement(pers1, word, numFavorite);
        GenericMethods.printElement(word,numFavorite,pers1);
    }
}
