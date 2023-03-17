package N1EX1;

public abstract class Instrumento {

    {
        System.out.println("Se esta inicializando desde el bloque de inicializacion");
    }

    static {
        System.out.println("Se esta inicializando desde el bloque estatico");
    }
    protected  String nombre;
    protected double precio;

	public Instrumento (String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public abstract void tocar();{
    }
}
