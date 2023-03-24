package N2EX1;

;

public class App {
    public static void main(String[] args) {

        Person pers = new Person("John", "Hatson", 99);
        String word = "Welcome";
        int num = 14;

        GenericMethods.printElement(word,pers,num);

        //GenericMethods.printElement(Person,word,num);  NOS DA ERROR PORQUE EL PRIMER PARAMETRO NO ES UN STRING
    }
}
