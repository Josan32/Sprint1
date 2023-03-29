package S1O3.N1EX2;

import java.util.*;

public class App {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> numbersReverse = new ArrayList<>();

        listNumReverse(numbers,numbersReverse);

    }
    public static void listNumReverse(List numbers, List numbersReverse) {
        ListIterator<Integer> listIterator = numbers.listIterator();

        while (listIterator.hasNext()) {
            listIterator.next();
        }
        while (listIterator.hasPrevious()) {
            numbersReverse.add(listIterator.previous());
        }
        System.out.println(numbersReverse);
    }

}
