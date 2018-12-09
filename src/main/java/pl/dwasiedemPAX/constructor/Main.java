package pl.dwasiedemPAX.constructor;

public class Main {
    public static void main(String[] args) {

//        Dish myLunch;
//        myLunch = new Dish();
//
//        Dish secondLunch = new Dish();

        System.out.println("////////////");
                Pizza pizza = new Pizza();

              //  Cutlet cutlet = new Cutlet ();  nie zadziała bo private
      Cutlet cutlet = Cutlet.giveMeNewNormalCutlet();

      Cutlet cutletOnion = Cutlet.newCutletWithOnion ("onion");
    }


}
