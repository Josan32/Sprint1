package S1O2.N1Ex1;

import java.util.ArrayList;

public class Sales {
    private  ArrayList<Product> products;
    private static int priceTotalSales;

    public Sales() {
        products = new ArrayList<Product>();
        priceTotalSales = 0;
    }
    public  void insertProduct(Product product){
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public  void calculate(){
        if(products.size() == 0){
            throw new EmpetySaleException();
        }

        for(int index = 0; index<products.size(); index +=1){
            priceTotalSales += products.get(index).getPrice();
        }

    System.out.println("The final price is: "+ priceTotalSales);
    }

}
