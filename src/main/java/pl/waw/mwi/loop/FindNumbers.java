package pl.waw.mwi.loop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FindNumbers {
    // List <integer>
    // 1000 elements, 1:100  - Random
    // find first '51' and print index of 51
    //use break;
    public static void main(String[] args) {
        Random losowacz = new Random();
        losowacz.nextInt(101);  // 101 bo bound ma wyłącznie, tak łapiemy do 100

        List<Integer> ints = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            ints.add(losowacz.nextInt(1001));

        }
        // ints.contains(51);
        // ints.indexOf(51);
        int indexOf51 = -1;  // -1 bo nie znamy, napewno go jeszcze nie ma

        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) == 51) {
                indexOf51 = i;
                break;
            }
        }

        System.out.println("Index of element: " + indexOf51);
    }
}
