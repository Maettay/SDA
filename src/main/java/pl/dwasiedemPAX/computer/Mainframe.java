package pl.dwasiedemPAX.computer;

public class Mainframe extends Computer {
    private String name = "computer";

    public void changeDisk() {
        System.out.println("Change disc on Mainframe, new faster");
    }

    @Override
    public String toString() {
        return "Mainframe";
    }


}
