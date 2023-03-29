package N1EX4;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> months = new ArrayList<>(List.of("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"));
        monthList(months);

    }
    public static void monthList(List<String> months) {
        months.forEach(System.out::println);
    }

}

