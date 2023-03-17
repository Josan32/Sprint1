package S1O3.N2EX1;

import java.lang.reflect.Array;
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

        System.out.println("------------");

        List<Restaurant> restaurantList = new ArrayList<Restaurant>(restaurants);

        Collections.sort(restaurantList, new Comparator<Restaurant>() {
            @Override
            public int compare(Restaurant p1, Restaurant p2) {
                if (p1.getQualification() != p2.getQualification()) {
                    return p1.getQualification() - p2.getQualification();
                }
                return p1.getName().compareTo(p2.getName());
            }
        });

        for(Restaurant i : restaurantList){
            System.out.println(i);
        }
    }


}
