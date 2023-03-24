package S1O4.N2EX1;

import java.io.File;
import java.util.Arrays;

public class DirectoryList {

    static void ListDirectory(String sDirectorio){
        File file = new File(sDirectorio);
        String[] listDirectory = file.list();

        if (file.exists()){
            Arrays.sort(listDirectory);
            for(int i=0; i < listDirectory.length; i +=1){
                System.out.println(listDirectory[i]);
            }
        }
        else{
            System.out.println("The folder is empety");

        }
    }
}
