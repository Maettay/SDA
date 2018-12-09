package pl.dwasiedemPAX.vehicle;

public class Vehicle  {

    private String name = "vehicle";
    protected String name2 = "vehicle";


    public void increaseSpeed(){
        System.out.println("increaseSpeed() from Vehicle");
    }
    public void move (){
        System.out.println("vehicle is moving");
    }
    public void printName () {
        System.out.println("vehicle");
    }
    public void editName (String name) { this.name = name;}
    public void editName2 (String name2) { this.name2 = name2;}






    @Override
    public String toString() {
        return "Vehicle";
    }
}
