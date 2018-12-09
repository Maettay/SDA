package pl.com.anonymous_classes.my_anonimous;

public class Cactus extends Plant {

    @Override
    public void grow () {
        System.out.println("Up");
    }
    @Override
    public void smell () {
        System.out.println("Intensive");
    }
    @Override
    public void wilt () {
        System.out.println("too fast");
    }
}
