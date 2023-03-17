package S1O3.N1EX3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        HashMap<String, String> capitalCountries = new HashMap<String, String>();

        String []lines = null;
        String data;
        ArrayList<String> listLines = new ArrayList<>();
        ArrayList<String> keyList = new ArrayList<>();
        String name = null;
        int numero;
        int calificacion = 0;
        try{
            File file = new File("countries.txt");
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine()){
                data = myReader.nextLine();
                listLines.add(data);
                for (int indice = 0; indice < listLines.size(); indice+=1){
                    String linea = myReader.nextLine();
                    String [] paisCapital = linea.split(" ");
                    capitalCountries.put(paisCapital[0],paisCapital[1]);
                    keyList.add(paisCapital[0]);
                }
            }
            myReader.close();
        }
        catch (Exception ex){
            System.out.println(ex);
        }

        name = pedirPalabra("What your names?");
        for (int indice = 0; indice <=10; indice +=1){
            numero = (int) (Math.random() * keyList.size());
            String countrie = keyList.get(numero);
            System.out.println("What is the capital of "+ countrie);
            String city = pedirPalabra("What is the capital of this country?");
            if (city.equals(capitalCountries.get(countrie).toLowerCase())){
                calificacion +=1;
            }

        }
        try{
            PrintWriter writer = new PrintWriter("calificaion.txt", "UTF-8");
            writer.println("Name: " + name);
            writer.println("your qualification is: " + calificacion);
            writer.close();
        }
        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
    static String pedirPalabra(String mensaje){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        String name = input.nextLine();
        return name;
    }


}
