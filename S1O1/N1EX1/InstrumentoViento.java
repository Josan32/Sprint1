package N1EX1;

public class InstrumentoViento extends Instrumento {

    public InstrumentoViento(String nombre, double precio){
        super(nombre, precio);
    }

    public void tocar(){
        System.out.println("Esta sonando un instrumento de viento");
    }

}
