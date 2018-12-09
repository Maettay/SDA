package pl.com.collection.list;

import pl.com.plant.Cactus;
import pl.com.plant.Plant;
import pl.com.plant.PricklyPear;
import pl.com.plant.Rose;

import java.util.ArrayList;
import java.util.List;

public class PlantsList {

    public static void main(String[] args) {
        // String []
        List<Plant> plants = new ArrayList<>();
        plants.add(new Cactus(5,3,1));
        plants.add(new Cactus(6,4,2));
        plants.add(new PricklyPear(7,5,3));
 plants.set (1, new Rose (30,5,0));
      //  plants.remove()


    }
}
