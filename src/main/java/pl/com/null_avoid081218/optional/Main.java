package pl.com.null_avoid081218.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Sink sink = new Sink("Koło");
        Bathroom withoutSink = new Bathroom(null);
        Bathroom withSink = new Bathroom(sink);
        House withBathroomWithSink = new House(withSink);
        House withBathroomWithoutSink = new House(withoutSink);
        House withoutBathroom = new House(null);

        // never ever!!!    Optional <String> maybeString;
        Optional<String> maybeString = Optional.empty();
        Optional<String> stringForSure = Optional.of("Mariusz");
        if (stringForSure.isPresent()) {
            System.out.println(stringForSure.get());
        }
        String maybeNull = null;
        Optional<String> absentString = Optional.ofNullable(maybeNull);
        absentString.ifPresent(x -> System.out.println(x));
    }

    private static void printLabelWithLambda (House house){
        Optional.ofNullable(house)
                .flatMap(house1 -> house1.getBathroom())
                .flatMap (bathroom -> bathroom.getSink())
                .map (sink -> sink.getLabel())
                .ifPresent(s ->System.out.println("Label: " + s));


    }

    private static void printLabelSlowMode(House house) {
        String label = "empty";
        Optional<House> maybeHouse = Optional.ofNullable(house);

        if (maybeHouse.isPresent()) {
            Optional<Bathroom> maybeBathroom = maybeHouse.get().getBathroom();

            if (maybeBathroom.isPresent()) {
                Optional<Sink> maybeSink = maybeBathroom.get().getSink();

                if (maybeSink.isPresent()) {
                    label = maybeSink.get().getLabel();
                }
            }
        }

    }

}
