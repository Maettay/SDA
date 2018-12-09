package pl.com.anonymous_classes.lambda021218;

public class Main {

    public static void main(String[] args) {
        Flyable bird = new Bird();

        Flyable plain = new Flyable() {
            @Override
            public void fly() {

            }
        };

        Flyable bullet = () -> System.out.println("Bullet can fly with lambda021218");

        Moveable emu = new Moveable() {
            @Override
            public void run() {

            }
        };
        Moveable moveable = () -> System.out.println("transfer to lambda021218, ruuuuun");

        Swimable swimable = (distance, speed) -> System.out.println("My distance is: " + distance);

        swimable.swim(10, 13);

        // gdy jest więcej poleceń w metodzie to muszą być klamry. Gdy jedna to może być bez.
        Swimable swimable1 = ((distance, speed) -> {
            System.out.println("first");
            System.out.println("second");
        });

        System.out.println("Here: " + (9 / 5));

        FormulaConverter anonymousConverter = new FormulaConverter() {
            @Override
            public double fromCelsiusToFahreiheit(double celsius) {
                return (celsius * 9.0 / 5.0) + 32;
            }
        };

        FormulaConverter converter = celsius -> (celsius * 9.0 / 5.0) + 32;

        MyLambda doublePrint = n -> {
            String result = "";

            for (; n > 0; n--) {
                result = result + "SDA";
            }

            return result;

        };

        FlyableCleaner cleaner = new FlyableCleaner();

        cleaner.clean(new Flyable() {
            @Override
            public void fly() {
                System.out.println("fly");
            }
        });

        cleaner.clean (()->{
            String a = "test";
  //          System.out.println(this.a);
        });


        SwimableCleanerClass anotherCleaner = new SwimableCleanerClass();

        anotherCleaner.cleanSwimable((distance, speed) -> {});




    }
}