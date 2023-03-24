package N1EX3;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;


public class Directory {

    public static void createFile (String directory) {

        File file = new File(directory);
        File[] directoryList = file.listFiles();

        if (file.exists()) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Arrays.sort(directoryList);

            for (File folders : directoryList) {
                if (folders.isDirectory()) {
                    printFile(String.format("%s - %s - %s",
                            folders.getName(),
                            folders.isDirectory() ? "D" : "F",
                            sdf.format(folders.lastModified())
                    ));
                    createFile(String.valueOf(folders));
                } else {
                    printFile(String.format("%s - %s - %s",
                            folders.getName(),
                            folders.isDirectory() ? "D" : "F",
                            sdf.format(folders.lastModified())
                    ));
                }
            }
        } else {
            System.out.println("Empty directory");
        }
    }

    public static void printFile (String data) {

        try{
            FileWriter fw = new FileWriter("directory.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(data);
            pw.close();

        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }


}



