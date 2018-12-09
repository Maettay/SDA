package pl.com.null_avoid081218;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

    Sink sink = new Sink("Koło");
    Bathroom withoutSink = new Bathroom (null);
    Bathroom withSink = new Bathroom(sink);
    House withBathroomWithSink = new House(withSink);
    House withBathroomWithoutSink = new House(withoutSink);
    House withoutBathroom = new House(null);

        displaySinkLabelVeryVeryNaive(withBathroomWithSink);
    }




    private static void displaySinkLabelVeryVeryNaive (House house) {
        String label = house.getBathroom().getSink().getLabel();
//        String label2 = house?.getBathroom()?.getSink().getLabel();
        System.out.println(label);
    }


    private static void displaySinkLabelWithNullCheck (House house){
        String label = "default";
        if (null != house) {
            Bathroom bathroom = house.getBathroom();

            if (null != bathroom){
                Sink sink = bathroom.getSink();

                if (null != sink) {
                    label = sink.getLabel();
                }
            }
        }

        System.out.println(label);
    }
    public static void xxx (House house) {
        Optional.ofNullable(house)
                .map(house1 -> house1.getBathroom())
                .map(bathroom -> bathroom.getSink())
                .map(sink -> sink.getLabel())
                .ifPresent(sinkF -> System.out.println("Marka sinka: " + sinkF));
    }


    String  name = "";
//    String nameWithNull = null;


}
