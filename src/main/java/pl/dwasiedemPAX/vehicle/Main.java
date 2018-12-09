package pl.dwasiedemPAX.vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.printName();

        Vehicle car = new Car();
        car.printName();
        // car.speedUp();
     //   Car carForSure = car;
        ((Car) car).speedUp();

        //upcasting
     //   Vehicle car2 =

        //downcasting
Boat boat = (Boat) car;
    }

}
