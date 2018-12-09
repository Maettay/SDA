package pl.com.generic;

import pl.dwasiedemPAX.animal.Animal;
import pl.dwasiedemPAX.animal.Dog;

public class GenericHolder<E> {

    E secret;

    public E getSecret(){
        return secret;
    }
    public void  setSecret(E secret){
        this.secret = secret;
    }

//    public static void addDog(List<? super Dog> animals) {animals.add(new Dog())}
//    public static void
//
//    for (Animal animal : animals);
//
//    animals.add(new Dog());

//
}
