package N2EX3;

public class App {
    public static void main(String[] args) {

        float result = calc(2,4,'+');
        System.out.println("The result of your operation is: "+ result);

        float result2 = calc(2,4,'-');
        System.out.println("The result of your operation is: "+ result2);

        float result3 = calc(2,4,'*');
        System.out.println("The result of your operation is: "+ result3);

        float result4 = calc(2,4,'/');
        System.out.println("The result of your operation is: "+ result4);


    }
    public static float calc(float num1,float num2,char symbol){
        float result = 0;
        switch (symbol) {
            case '+' -> result = num1 + num2;
            case '-' -> result =num1 - num2;
            case '*' -> result =num1 * num2;
            case '/' -> result =num1 / num2;

        };
        return result;
    }
}

