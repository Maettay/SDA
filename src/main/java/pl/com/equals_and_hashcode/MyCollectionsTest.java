package pl.com.equals_and_hashcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyCollectionsTest {

    public static void main(String[] args) {
        //2 listy
        // dodajemy 500 elementów
        // first for searchnig    - ArrayList
        // second for adding     - LinkedList

        List<Integer> search = new ArrayList<>();
        List<Integer> add = new LinkedList<>();

        Random random = new Random(100);
        random.nextInt(500);

        for (int i = 0; i<500; i++){
            search.add(random.nextInt());
            add.add(random.nextInt());
        }

        for (int i = search.size() - 1; i > -1; i-- ){
        System.out.println("Add[" + i + "]: " + add.get(i));
        System.out.println("Search[" + i + "]: " + search.get(i));
        }

        System.out.println(add);
        System.out.println(search);
    }

}
