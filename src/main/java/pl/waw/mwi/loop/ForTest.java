package pl.waw.mwi.loop;

public class ForTest {

    public static void main(String[] args) {
        printNTimes(1, "ala");
        printNTimes(100, "ala ma kota");
        printNTimes(1_000, "ala ma kota");
    }

    public static void printNTimes(int numberOfTimes, String valueToPrint) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println(valueToPrint);
        }

  //      System.out.println(i);
    }

    public static void printMyName() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Mateusz");
        }
    }

    public static void infiniteLoop () {
        for (; ; ) {
        }

    }
}

