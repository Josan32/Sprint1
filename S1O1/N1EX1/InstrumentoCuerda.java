package N1EX1;

public class InstrumentoCuerda extends Instrumento{

    public InstrumentoCuerda (String nombre, double precio){
        super(nombre, precio);
    }

    public void tocar(){
        System.out.println("Esta sonando un instrumento de cuerda");
    }
}
