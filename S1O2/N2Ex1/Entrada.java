package S1O2.N2Ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    public static byte readByte(String message){
        boolean fin;
        byte dada = 0;
        do{
            try{
                fin = false;
                Scanner input = new Scanner(System.in);
                System.out.println(message);
                dada = input.nextByte();
            }
            catch (InputMismatchException ex){
                System.out.println("You should introduce a integer number");
                fin = true;
            }
        }
        while(fin);
        return dada;
    }
    public static int readInt(String message){
        boolean fin;
        int dada = 0;
        do{
            try{
                fin = false;
                Scanner input = new Scanner(System.in);
                System.out.println(message);
                dada = input.nextInt();
            }
            catch (InputMismatchException ex){
                System.out.println("You should introduce a integer number");
                fin = true;
            }
        }
        while(fin);
        return dada;
    }
    public static float readFloat(String message){
        boolean fin;
        float dada = 0;
        do{
            try{
                fin = false;
                Scanner input = new Scanner(System.in);
                System.out.println(message);
                dada = input.nextFloat();
            }
            catch (InputMismatchException ex){
                System.out.println("You should introduce a float number");
                fin = true;
            }
        }
        while(fin);
        return dada;
    }
    public static double readDouble(String message){
        boolean fin;
        double dada = 0;
        do{
            try{
                fin = false;
                Scanner input = new Scanner(System.in);
                System.out.println(message);
                dada = input.nextDouble();
            }
            catch (InputMismatchException ex){
                System.out.println("You should introduce a double number");
                fin = true;
            }
        }
        while(fin);
        return dada;
    }
    public static char readChar(String message){
        boolean fin = false;
        char dada = 0;
        while(!fin) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println(message);
                String dada2 = input.nextLine();
                if (dada2.length() < 2) {
                    dada = dada2.charAt(0);
                    fin = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception ex) {
                System.out.println("ERROR. You should introduce a one character");
            }
        }
        return dada;
    }
    public static String readString(String message){
        boolean fin;
        String dada = "null";
        do{
            try{
                fin = false;
                Scanner input = new Scanner(System.in);
                System.out.println(message);
                dada = input.nextLine();
               
            }
            catch (Exception ex){
                System.out.println("ERROR. You should introduce one dade of class string");
                fin = true;
            }
        }
        while(fin);
        return dada;
    }
    public static boolean readYesNo(String message){
        boolean fin = false;
        boolean sign = false;
        while(!sign) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println(message);
                String dada2 = input.nextLine();
                if (dada2.length() < 2) {
                    if (dada2.equals("s")){
                        fin = true;
                    }
                    else{
                        fin = false;
                    }
                    sign = true;

                } else {
                    throw new Exception();
                }
            } catch (Exception ex) {
                System.out.println("ERROR. You should introduce a one character");
            }
        }
        return fin;
    }
}
