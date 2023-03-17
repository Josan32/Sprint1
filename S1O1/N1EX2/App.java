package N1EX2;

public class App {
    public static void main (String [] args){

            Coche car1 = new Coche("Mini", 120);
            car1.acelerar();
            Coche.frenar(); //  AL SER UN METODO STATIC HAY QUE LLAMARLO CON LA CLASE Y NO CON EL OBJETO

            System.out.println(car1);
            Coche.setModelo("A1");

            System.out.println(car1);
    }
}
