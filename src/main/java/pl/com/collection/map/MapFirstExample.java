package pl.com.collection.map;

import pl.com.equals_and_hashcode.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFirstExample {
    public static void main(String[] args) {
        Map<String, String> idsOverNames = new HashMap<>();
//        System.out.println(idsOverNames.put("82111812345", "Mariusz"));
//        System.out.println(idsOverNames.put("82111812345", "Marcin"));
//        System.out.println(idsOverNames.put("82111812345", "Ewa"));
     idsOverNames.put("82111812345", "Mariusz");
     idsOverNames.put("85071387654", "Przemek");
     idsOverNames.put("95020257382", "Ola");
     idsOverNames.put("12222266789", "Kasia");
     idsOverNames.put("99071634729", "Krzyś");

// idsOverNames.get("82111812345");

for (String key : idsOverNames.keySet()) {

    System.out.println("Key: " + key + ", value: " + idsOverNames.get(key));
        }
////
        System.out.println("////");

        Map<String, String> secondMap = new LinkedHashMap<>();



    }

}

//82111812345 Mariusz
//85071387654 Przemek
//95020257382 Ola
//12222266789 Kasia
//99071634729 Krzyś
