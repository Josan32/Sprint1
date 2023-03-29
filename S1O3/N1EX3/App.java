package S1O3.N1EX3;

import java.io.*;
import java.lang.reflect.Method;
import java.util.*;


public class App {
    public static void main(String[] args) {

        createFile();
    }
    public static HashMap readFile (){
        HashMap <String, String> countries = new HashMap <String, String>();
        BufferedReader br = null;
        String line;

        try {
            br = new BufferedReader(new FileReader("countries.txt"));

            while ((line = br.readLine()) != null) {
                StringTokenizer word = new StringTokenizer(line);

                while (word.hasMoreElements()) {
                    countries.put(word.nextToken().toString(), word.nextToken().toString());
                }
            }
        } catch (Exception e) {
            System.out.println ("File not found");

        } finally {
            try{
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                System.out.println ("Error closing the file");
            }
        }
        return countries;
    }
    public static void createFile () {

        try {
            PrintWriter writer = new PrintWriter("qualification.txt");
            writer.println(name() + " and his rating is " + challenge());
            writer.close();
            System.out.println("The file has been created successfully");

        } catch (IOException e) {
            System.out.println("The file could not be created");
        }
    }
    public static String name () {
        Scanner sc = new Scanner(System.in);
        System.out.println ("What's your name?");
        String name = sc.nextLine();
        return name;
    }

    public static int challenge () {
        HashMap countries = readFile();
        Scanner sc = new Scanner(System.in);
        int points = 0;

        for (int i = 0; i <= 10; i++) {
            Object [] randomCountry = countries.keySet().toArray();
            Object country = randomCountry [new Random().nextInt(randomCountry.length)];

            System.out.println ("What's the capital of " + country);
            String capital = sc.nextLine ();

            if (capital.equalsIgnoreCase(countries.get(country).toString())) {
                points ++;
            }
        }
        return points;
    }

}
