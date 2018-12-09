package pl.com.inner_class;

import static pl.com.inner_class.Vehicle.Wheel;


public class Main {

    public static void main(String[] args) {
        Vehicle lexus = new Vehicle("Lex", new Wheel(19));
        Vehicle.Wheel Aez = new Vehicle.Wheel(18);  // Vehicle.Wheel - potrzebny prefiks Vehicle bo klasa Wheel jest w nim zagnie zd zona
        Wheel Oz = new Wheel(17);

//        System.out.println("Vehicle: " + lexus);
//       System.out.println("Wheels: " + Aez);
       System.out.println(lexus);
       System.out.println(Aez);
       System.out.println(Oz);


    }

}
