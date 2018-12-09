package pl.com.generic;

import pl.dwasiedemPAX.vehicle.Car;
import pl.dwasiedemPAX.vehicle.Plain;
import pl.dwasiedemPAX.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class GenericVehicleTest {
    // method takes List of Vehicle
    // method for displaying list of Cars/Planes/
    // method for adding Cars to List

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle());
        vehicleList.add(new Car());
        vehicleList.add(new Plain());


    }

    public static void addCar(List<? super Car> vehicles) {
        vehicles.add(new Car());
    }
    public static void processAnimals(List<? extends Vehicle> vehicles) {

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
