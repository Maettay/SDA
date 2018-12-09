package pl.dwasiedemPAX.constructor;

public class Cutlet {

    private Cutlet (){
        System.out.println("Cutlet");

    }
    private Cutlet (String onion){

    }

    public static Cutlet giveMeNewNormalCutlet (){
        return new Cutlet();
    }
    public static Cutlet newCutletWithOnion (String onion) {
        return new Cutlet(onion);
    }


}
