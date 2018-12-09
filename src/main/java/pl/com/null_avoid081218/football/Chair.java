package pl.com.null_avoid081218.football;

public class Chair {
    private Number number;

    public Chair(Number number) {
        this.number = number;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "number=" + number +
                '}';
    }
}

