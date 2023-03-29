package S1O4.N1EX2;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String numDni;
        System.out.println("Write your number of dni:");
        numDni = sc.nextLine();
        Dni dni = new Dni();
        System.out.println(numDni + dni.calculLeterDni(numDni));
    }

}
