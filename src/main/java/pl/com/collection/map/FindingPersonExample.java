package pl.com.collection.map;

import pl.com.equals_and_hashcode.Person;

import java.util.*;

public class FindingPersonExample {

    public static void main(String[] args) {
        // 1) map ids over Person
        // 2) add 10 persons to map
        // 3) find only persons younger than 25
        // 4) add results to list

        // 1)
        Map<String, Person> idsOverAge = new HashMap<>();
        idsOverAge.put("35", new Person("Mariusz", "Swe", 35));
        idsOverAge.put("33", new Person("Ra", "Rol", 33));
        idsOverAge.put("34", new Person("Pa", "Ger", 21));
        idsOverAge.put("36", new Person("Fa", "Dan", 23));
        idsOverAge.put("37", new Person("Ga", "Ger", 25));
        idsOverAge.put("38", new Person("Ca", "Ger", 27));
        idsOverAge.put("39", new Person("Wa", "Ger", 34));
        idsOverAge.put("40", new Person("Pa", "Nor", 15));
        idsOverAge.put("32", new Person("La", "Ruu", 26));
        idsOverAge.put("13", new Person("Ja", "Esp", 30));

        List<Person> youngPerson = new LinkedList<>();

        Person currentPerson;
        for (String id : idsOverAge.keySet()) {
            currentPerson = idsOverAge.get(id);

            if (currentPerson.getAge() <= 25) {
                youngPerson.add(currentPerson);
            }
        }
        for (Person p : youngPerson) {
            System.out.println("Young person: " + p);
        }

    }

}