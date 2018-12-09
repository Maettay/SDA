package pl.com.anonymous_classes;

public class Main {
    public static void main(String[] args) {
        Animal monkey = new Monkey();
        Animal parrot = new Animal() {
            @Override
            public void printAnimalName() {
                System.out.println("Parrot");
            }
        };
        Animal duck = new Animal() {
            @Override
            public void printAnimalName() {
                System.out.println("Duck");
            }
            public void makeSound(){
                System.out.println("kwa kwa");
            }
        };

        new Animal() {
            @Override
            public void printAnimalName() {
                System.out.println("Duck");
            }
            public void makeSound(){
                System.out.println("kwa kwa");
            }
        }.makeSound();

        Monkey monkey1 = new Monkey(){
            @Override
            public void printAnimalName() {
                System.out.println("Gorilla");
            }
        };

        AnimalProcessor processor = new AnimalProcessor();
        processor.processAnimal(monkey);
        processor.processAnimal(parrot);
        processor.processAnimal(duck);
        processor.processAnimal(new Animal() {
            @Override
            public void printAnimalName() {
                System.out.println("Duucuk!");
            }
        });


        ShowSecret secret = new ShowSecret() {
            @Override
            public void printSecret() {
                System.out.println("secret");
            }
        };
        SecretProcessor secret1 = new SecretProcessor();
        secret1.processSecret (new ShowSecret() {
            @Override
            public void printSecret () {
                System.out.println("Treasure");
            }
        });

        SuperHeroProcessor gym = new SuperHeroProcessor();
        Superman superman = new Superman();

 //       gym.trainHero (superman);

        Moveable batman = new Moveable() {
            @Override
            public void run() {
                System.out.println("Quite fast");
            }

            @Override
            public void fly() {
                System.out.println("Cannot");
            }
        };


    }


}
