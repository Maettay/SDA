package pl.dwasiedemPAX.animal;

public class Main {

    public static void main(String[] args) {
        Dog szarik = new Dog();
        szarik.whichAnimal();
        szarik.makeSound();


        Animal maybeDog = new Dog();
//        maybeDog.makeSound();

        Animal maybeCat = new Cat();

        Animal maybeMonkey = new Monkey();
        Object monkey = new Monkey();


    }

}
