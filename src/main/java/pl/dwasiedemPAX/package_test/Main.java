package pl.dwasiedemPAX.package_test;

import pl.dwasiedemPAX.package_test.one.Speaker;
//import pl.dwasiedemPAX.package_test.two.Speaker;    // możemy tylko raz przywołać klasę
//import pl.dwasiedemPAX.package_test.three.Speaker;

public class Main {

    public static void main(String[] args) {
       Speaker one = new Speaker();
        //pl.dwasiedemPAX.package_test.one.Speaker one = new pl.dwasiedemPAX.package_test.one.Speaker();
        //Speaker two = new Speaker();
        pl.dwasiedemPAX.package_test.two.Speaker two = new pl.dwasiedemPAX.package_test.two.Speaker();
        //Speaker three = new Speaker();
        pl.dwasiedemPAX.package_test.three.Speaker three = new pl.dwasiedemPAX.package_test.three.Speaker();

        one.speak();
        two.speak();
        three.speak();


    }


}
