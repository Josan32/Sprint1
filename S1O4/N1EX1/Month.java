package S1O4.N1EX1;


import java.util.ArrayList;

public class Month {

    static ArrayList<String> insertMonths(ArrayList listmonths){
        listmonths.add("Enero");
        listmonths.add("Febrero");
        listmonths.add("Marzo");
        listmonths.add("Abril");
        listmonths.add("Mayo");
        listmonths.add("Junio");
        listmonths.add("Julio");
        listmonths.add("Agosto");
        listmonths.add("Septiembre");
        listmonths.add("Octubre");
        listmonths.add("Noviembre");
        listmonths.add("Diciembre");
        return listmonths;
    }

    static int siceList(ArrayList listmonths){
        return listmonths.size();
    }
    static String get8(ArrayList listmonths){
        String month = (String) listmonths.get(8);
        return month;
    }
    static boolean isNull(ArrayList listmonths){

        return listmonths.size()>0;
    }
}
