package pl.com.null_avoid081218.optional;

import java.util.Optional;

public class Bathroom {
    private Sink sink;

    public Bathroom(Sink sink) {
        this.sink = sink;
    }

    public Optional<Sink> getSink() {

        return Optional.ofNullable(sink);
    }

    public void setSink(Sink sink) {
        this.sink = sink;
    }

    @Override
    public String toString() {
        return "Bathroom{" +
                "sink=" + sink +
                '}';
    }
}
