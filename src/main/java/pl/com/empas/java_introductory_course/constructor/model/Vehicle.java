package pl.com.empas.java_introductory_course.constructor.model;

public class Vehicle {

    static {
        System.out.println("vehicle's static block");
    }

    private final String what;

    {
        System.out.println("vehicle's init block");
    }

    public Vehicle(String what) {
        System.out.println("vehicle's constructor");
        this.what = what;
    }

    public void move() {
        System.out.println("vehicle is moving");
    }
}
