package pl.dwasiedemPAX.computer;

public class Computer {

    private String name = "computer";

    public void changeDisk() {
        System.out.println("Change disc on Computer, new faster");
    }

//    public static void print(){
//    Computer.print();
//    computer.print();
//    }

    @Override
    public String toString() {
        return "Computer";
    }


}
