package N1EX2;

public class Coche {
    private static final String marca = "Opel"; // constante de clase.  pueden acceder a el los metodos statics y no modificable
    private static String modelo; // constante y pueden acceder a el los metodos statics
    private final int potencia; // constante de objeto. no modificable pero accesible desde metodos y el main

    public Coche(String modelo, int potencia) {
        this.potencia = potencia;
        //this.marca = marca ;
        this.modelo = modelo;
    }

    public static String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public static void setModelo(String modelo) {
        Coche.modelo = modelo;
    }

    public String toString(){
        return "El coche con la marca "+ marca + " con el modelo "+ modelo +" y con potencia "+ potencia;
    }

    public static void frenar(){

        System.out.println("El coche esta frenando");
    }

    public void acelerar() {
        System.out.println("El coche esta acelerando");
    }

}

