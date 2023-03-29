package N1EX4;

import java.io.File;
import java.util.Scanner;

public class ReaderDirectory {

    private static String data;


    public static void readFile(File file){
        try{
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine()){
                data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
}
