package pl.com.equals_and_hashcode;

import java.sql.SQLOutput;
import java.util.*;

public class EqulityTest {

    public static void main(String[] args) {
        //ArrayList for person
        // add 4 person
        // 2 duplicates

        //create new duplicate which exists in arraylist
//
//        int[] ArrayList = new int[4];
//        ArrayList person = new ArrayList ();
//
//        person.add(a);
//

        List<Person> peoples = new ArrayList();
        peoples.add (new Person("Mariusz","P.",35));
        peoples.add (new Person("Marius","P.",25));
        peoples.add (new Person("Mariu","P.",15));
        peoples.add (new Person("Mariusz","P.",35));

        Person personToFind = new Person("Mariusz","P.",35);

        System.out.println("contains: " + peoples.contains(personToFind));

        Set<Person> personSet = new HashSet<>();
        personSet.addAll(peoples);

        System.out.println("Set size: " + personSet.size());

        for (Person person : personSet) {
            System.out.println("Person: " + person);
        }

        Set<Person> anotherSet = new LinkedHashSet<>();
        List<Person> personList = new LinkedList<>();


    }

}
