package S1O4.N1EX3;


public class Lista {


    public static void getList(Integer[] list,int index) throws ArrayIndexOutOfBoundsException{

        try {
            System.out.println(list[index]);

        }catch (ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

}




