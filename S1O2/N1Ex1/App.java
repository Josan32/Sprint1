package S1O2.N1Ex1;

public class App {
    public static void main (String [] args){

        Product product1 = new Product("Patata", 2);
        Product product2 = new Product("leche", 1);
        Product product3 = new Product("tomate", 4);

        Sales venta1 = new Sales();

        venta1.insertProduct(product1);
        venta1.insertProduct(product2);
        venta1.insertProduct(product3);

        venta1.calculate();

        Sales venta2 = new Sales();
        venta2.calculate();

    }
}
