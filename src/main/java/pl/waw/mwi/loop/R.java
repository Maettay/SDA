package pl.waw.mwi.loop;

public class R {
    static int a = 5;   // albo dopisujemy static albo 1*

    //getter
    public int getA(){
        return this.a;
    }

    public static void main(String[] args) {
        char currentChar = 'a';
        while (currentChar != 'r') {    // działa tak długo jak aż nastąpi r, gdy od razu się wykona to wogóle isę nie wykonuje
            // read char
            //skanner

        for ( ; currentChar != 'r' ; ) {}     // zamiana pętli for na while


            do {
                // do something
            } while(currentChar != 'r');   // wykona sie przynajmniej raz, bo jest srawdzany na końcu.

            // pętla do za pomocą pęłtli while
            do {

                // do something
            } while(currentChar != 'r');   // wykona sie przynajmniej raz, bo jest srawdzany na końcu.




        }
    }

    public static void printNumbers() {
        //100
        for (int i = 1; 1<= 100 ; i++){
            if (i<52) {
                System.out.println("i: " + i);
            } else {
                break;  // break mówi nam przerwij pętlę
            }
        }


    }
}
