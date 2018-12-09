package pl.dwasiedemPAX.computer;

public class PC extends Computer {

    private String name = "computer";

    public void changeDisk() {
        System.out.println("Change disc on PC, new faster");
    }

    @Override
    public String toString() {
        return "PC";
    }

}
