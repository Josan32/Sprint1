package N2EX2;

public class GenericMethods {


    public static <T> void printElement2(T... args){
        System.out.println("The numbers of args is: "+ args.length);
        for (T arg: args){
            System.out.println("\t"+"-"+arg);
        }
    }
}
