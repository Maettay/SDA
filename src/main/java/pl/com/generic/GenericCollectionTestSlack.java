package pl.com.generic;

import pl.dwasiedemPAX.animal.Animal;
import pl.dwasiedemPAX.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class GenericCollectionTestSlack {

    // method takes list of Animals
    // send Dogs and Cats

    public static void main(String[] args) {

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        processAnimal(dogs);

        ArrayList<Dog> dogsList = new ArrayList<>();
        dogsList.add(new Dog());
        dogsList.add(new Dog());
        processAnimals(dogsList);
    }

    public static void processAnimal(Animal[] animals) {

        for (Animal animal : animals) {
            System.out.println(animal);
        }
        //
    }

    public static void addDog(List<? super Dog> animals) {
        animals.add(new Dog());
    }
////addDog(dogsList);
//    List<Animal> animals = new ArrayList<>();
//    addDog(animals);
//}

    public static void processAnimals(List<? extends Animal> animals) {

        for (Animal animal : animals) {
            System.out.println(animal);
        }
     //   animals.add(new Dog());
    }
}


