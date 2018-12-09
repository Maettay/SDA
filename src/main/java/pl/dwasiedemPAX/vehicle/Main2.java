package pl.dwasiedemPAX.vehicle;

public class Main2 {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle plain = new Plain();

        vehicle.move();
        car.move();
        boat.move();

        vehicle.increaseSpeed();
        car.increaseSpeed();
        boat.increaseSpeed();
        plain.increaseSpeed();

        processVehicle(vehicle);
        processVehicle(car);
        processVehicle(boat);
        processVehicle(plain);

        increseSpeed(vehicle);
        increseSpeed(car);
        increseSpeed(boat);
        increseSpeed(plain);
    }

    public static void processVehicle(Vehicle vehicle){
        System.out.println("Info about vehicle: " + vehicle);
    }

    public static void increseSpeed (Vehicle vehicle){
        System.out.println("from method increaseSpeed (Vehicle)");
        vehicle.increaseSpeed();
        System.out.println();
    }


}
