package S1O2.N1Ex1;

public class EmpetySaleException extends IndexOutOfBoundsException{


    public EmpetySaleException() {
        super("To make a sale you must first add a product");
    }

}
