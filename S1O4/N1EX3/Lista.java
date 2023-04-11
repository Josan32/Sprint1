package S1O4.N1EX3;

public class Lista {


    public static void getList() throws ArrayIndexOutOfBoundsException{
        Integer[] list = {1,2,3};

        try {
            System.out.println(list[4]);

        }catch (ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}




