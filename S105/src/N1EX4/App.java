package N1EX4;


import java.io.File;

public class App {
    public static void main(String [] args) {
        ReaderDirectory.readFile(new File(String.valueOf(args[0])));


    }

}
