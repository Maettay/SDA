package pl.dwasiedemPAX.vehicle;

public class Car extends Vehicle {
    public void speedUp(){
        System.out.println("speed()");


    }
    @Override
    public void increaseSpeed(){
       System.out.println("increaseSpeed() from Car");
    }
    @Override
    public void move() {
       // super.move();
        System.out.println("Car is driving");

    }

    @Override
    public String toString() {
        return "Car";
    }
}
