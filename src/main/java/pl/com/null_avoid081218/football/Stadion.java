package pl.com.null_avoid081218.football;

public class Stadion {

    private Chair chair;

    public Stadion(Chair chair) {
        this.chair = chair;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Stadion{" +
                "chair=" + chair +
                '}';
    }
}
