package N1EX2;

import javax.swing.tree.DefaultMutableTreeNode;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DirectoryList {

    public static void sortTree(String sDirectorio){
        File file = new File(String.valueOf(sDirectorio));
        File[] listDirectory = file.listFiles();

        if (file.exists()){

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Arrays.sort(listDirectory);
            for(int i=0; i < listDirectory.length; i +=1){
                File directory = listDirectory[i];
                    if (directory.isDirectory()){
                        System.out.println(String.format("%s (%s) - %s",
                                directory.getName(),
                                directory.isDirectory() ? "D" : "F",
                                sdf.format(directory.lastModified())
                        ));
                        sortTree(String.valueOf(directory));
                    }
                    else{
                        System.out.println(String.format("%s -%s - %s",
                                directory.getName(),
                                directory.isDirectory() ? "D" : "F",
                                sdf.format(directory.lastModified())
                        ));
                    }
            }
        }
        else{
            System.out.println("The folder is empty");
        }
    }
}
