package pl.com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListFirstExample {

    public static void main(String[] args) {
        // String []
        List<String> strings = new ArrayList<>();
        strings.add ("enum");
        strings.add ("abstract");

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        // drugi sposób na pętle
        for (String s : strings) {
            System.out.println(s);
        }

    }

}
