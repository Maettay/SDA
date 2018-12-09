package pl.com.null_avoid081218.football;

public class FootballClub {
    private Stadion stadium;

    public FootballClub(Stadion stadium) {
        this.stadium = stadium;
    }

    public Stadion getStadium() {
        return stadium;
    }

    public void setStadium(Stadion stadium) {
        this.stadium = stadium;
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "stadium=" + stadium +
                '}';
    }
}
