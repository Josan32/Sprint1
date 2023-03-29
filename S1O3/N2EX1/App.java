package S1O3.N2EX1;

import java.util.*;

public class App {

    public static void main(String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<Restaurant>();

        restaurants.add(new Restaurant("Pepe", 6));
        restaurants.add(new Restaurant("Pepe", 6));
        restaurants.add(new Restaurant("Josep", 5));

        for(Restaurant i: restaurants){
            System.out.println(i);
        }
    }
}
