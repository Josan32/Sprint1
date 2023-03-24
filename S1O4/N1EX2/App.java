package S1O4.N1EX2;


import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        int n = 53021197 % 23;
        System.out.println(n);

        ArrayList<String> lista_letras = new ArrayList<String>();
        lista_letras.add("t");lista_letras.add("r");lista_letras.add("w");lista_letras.add("a");
        lista_letras.add("g");lista_letras.add("m");lista_letras.add("y");lista_letras.add("f");
        lista_letras.add("p");lista_letras.add("d");lista_letras.add("x");lista_letras.add("b");
        lista_letras.add("n");lista_letras.add("j");lista_letras.add("z");lista_letras.add("s");
        lista_letras.add("q");lista_letras.add("v");lista_letras.add("h");lista_letras.add("l");
        lista_letras.add("c");lista_letras.add("k");lista_letras.add("e");

        System.out.println(lista_letras.get(n));

        int dni = 53021197;
        ArrayList<String>letterDni = new ArrayList<>();
        Dni.letterList(letterDni);
        String letter = Dni.calculLeterDni(dni,letterDni);
        System.out.println(letter);
    }

}
