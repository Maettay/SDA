package pl.com.inner_class;

public class Vehicle {

    private String vehicleName;
    private Wheel wheels;



    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                '}';
    }

    public Vehicle (String vehicleName, Wheel wheels) {
        this.vehicleName = vehicleName;

    }

//    @Override
//    public String toString() {
//        return "Vehicle{" +
//                "vehicleName='" + vehicleName + '\'' +
//                '}';
//    }

    public static class Wheel {
        private int numberOfWheels;

        public Wheel(int numberOfWheels) {
            this.numberOfWheels = numberOfWheels;
        }

        @Override
        public String toString() {
            return "Wheel{" +
                    "numberOfWheels=" + numberOfWheels +
                    '}';
        }
    }

}
