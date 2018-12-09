package pl.dwasiedemPAX.vehicle;

public class Boat extends Vehicle {

    public void swim() {
        System.out.println("swim()");

    }
    @Override
    public String toString() {
        return "Boat";
    }
    @Override
    public void increaseSpeed(){
        System.out.println("increaseSpeed() from Boat");
    }
    @Override
    public void move() {
        //   super.move();
        System.out.println("Boat is swiming...");

    }


}
