package N2EX1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.setProperty("Path", args[0]);
        p.setProperty("file", "directory.txt");

        p.store(new FileWriter("info.properties"),"Javatpoint Properties Example");

        Directory dic1 = new Directory();
        dic1.createFile(args[0]);
    }

}




