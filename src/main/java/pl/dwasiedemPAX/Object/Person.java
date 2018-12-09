package pl.dwasiedemPAX.Object;

public class Person {

    public static int numberOfPersons = 0;

    private String name;
    private String surname;
    private int age;

    public Person() {
        //empty   jeśli robimy swój konstruktor to wywalamy domyślny jawowy konstruktor
        numberOfPersons++;

    }

    public Person(String name, String surname, int age) {

        this.name = name;
        this.surname = surname;
        this.age = age;


    }



    // It's not constructor, it's method
    //public void Person(){
    //}

    public void introducePerson (){
        System.out.println("Hi, I'm: " + name +" "+ surname + ". I'm " + age + "years old");
    }

    public static void somethingAboutPeprsons() {
        System.out.println("All people like math!!");
    }

    public static void printNumberOfPersons(){
        System.out.println("Number of persons so far");
    }


}
