package pl.waw.mwi.loop;

public class WhileTest {
    static int a = 5;   // albo dopisujemy static albo 1*

    //getter
    public int getA(){
        return this.a;
    }

    public static void main(String[] args) {

        int  a = 6;  // *1 albo to zrobimy nowy new WhileTest(). a = 6;

        new WhileTest().getA();
        new WhileTest().getA();


    }


}

class Main {
    public static void main(String[] args) {
        // tu już nie zobaczymy privata z powy zszych linijek, jest on tylko do klasy
    }

}

