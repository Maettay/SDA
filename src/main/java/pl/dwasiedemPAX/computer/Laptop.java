package pl.dwasiedemPAX.computer;

public class Laptop extends Computer {
    private String name = "computer";

    public void changeDisk() {
        System.out.println("Change disc on Laptop, new faster");
    }

    @Override
    public String toString() {
        return "Laptop";
    }
}
