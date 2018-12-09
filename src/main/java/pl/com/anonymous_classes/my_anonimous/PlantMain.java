package pl.com.anonymous_classes.my_anonimous;

public class PlantMain {
    public static void main(String[] args) {


        Gardner Yogi = new Gardner();
        Yogi.processPlant (new Cactus());


        Plant rose = new Plant() {
            @Override
            public void grow() {
                System.out.println("Rose Up");
            }

            @Override
            public void smell() {
                System.out.println("Rose smell intensive");
            }

            @Override
            public void wilt() {
                System.out.println("Rose wilt too fast");
            }
        };

        Yogi.processPlant(new Plant() {
            @Override
            public void grow() {

            }

            @Override
            public void smell() {

            }

            @Override
            public void wilt() {

            }
        });


    }

}
