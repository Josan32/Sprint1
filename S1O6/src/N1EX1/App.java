package N1EX1;

public class App {
    public static void main(String[] args) {

        String element1 = "hola";
        String element2 = "adios";
        String element3 = "by";

        NoGenericMethods first = new NoGenericMethods(element1,element2,element3);
        System.out.println(first);

        NoGenericMethods second = new NoGenericMethods(element3,element1,element2);
        System.out.println(second);




    }
}