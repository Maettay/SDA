package pl.com.anonymous_classes;

public class Superman implements Moveable {

    @Override
    public void run () {
        System.out.println("Very fast!");
    }
    @Override
    public void fly () {
        System.out.println("Very high!");
    }
}

