package N1EX1;

public class InstrumentoPercusion extends Instrumento{

    public InstrumentoPercusion (String nombre, double precio){
        super(nombre, precio);
    }

    public void tocar(){
        System.out.println("Esta sonando un instrumento de percusion");
    }
}
