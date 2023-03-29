package S1O3.N1EX1;

import  java.util.*;
public class App {
    public static void main(String[] args) {

        ArrayList <Month> months = new ArrayList<Month>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        months.add(7,new Month("August"));

        for (int indice = 0; indice< months.size(); indice +=1){
            System.out.println(months.get(indice).getName());
        }

        System.out.println("---------------");

        HashSet<Month> monthsSet = new HashSet<>(months);
        monthsSet.add(new Month("January"));


        for ( Month value : monthsSet){
            System.out.println(value.getName());
        }

        System.out.println("---------------");

        Iterator<Month> iterador = monthsSet.iterator();

        while (iterador.hasNext()){
            System.out.println(iterador.next().getName());
        }

    }

}
