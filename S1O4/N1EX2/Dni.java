package S1O4.N1EX2;

import java.util.ArrayList;

public class Dni {


    public String calculLeterDni( String numberDni) {
        ArrayList<String> lista_letras = new ArrayList<>();

        lista_letras.add("T");lista_letras.add("R");lista_letras.add("W");lista_letras.add("A");
        lista_letras.add("G");lista_letras.add("M");lista_letras.add("Y");lista_letras.add("F");
        lista_letras.add("P");lista_letras.add("D");lista_letras.add("X");lista_letras.add("B");
        lista_letras.add("N");lista_letras.add("J");lista_letras.add("Z");lista_letras.add("S");
        lista_letras.add("Q");lista_letras.add("V");lista_letras.add("H");lista_letras.add("L");
        lista_letras.add("C");lista_letras.add("K");lista_letras.add("E");

        return lista_letras.get(Integer.parseInt(numberDni) % 23);
    }

}
