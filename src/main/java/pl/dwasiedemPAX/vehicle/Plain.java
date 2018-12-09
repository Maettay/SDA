package pl.dwasiedemPAX.vehicle;

public class Plain extends Vehicle {

    public void fly (){


    }
    @Override
    public void increaseSpeed(){
        System.out.println("increaseSpeed() from Plain");
    }
    @Override
    public String toString() {
        return "Hello, it's new vehicle: Plain";
    }
}
