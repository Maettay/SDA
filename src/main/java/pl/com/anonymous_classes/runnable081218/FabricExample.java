package pl.com.anonymous_classes.runnable081218;

public class FabricExample {

    String name = "Wrrrr";

    public static void main(String[] args) {
        MyRunn one = new MyRunn();
        one.run();
        MyRunn two = new MyRunn();
        two.run();
        makeNewRunnable();
        makeNewRunnable();
    }

    private static Runnable makeNewRunnable() {
        return new Runnable() {
            private String name = "Mat";

            @Override
            public void run() {
                String name = "Piotrek";
                System.out.println("my name: " + this.name);   // to this, mówi w tym obiekcie
            }
        };

    }

    private static Runnable makeNewRunnableWithLambda() {
        return () -> {
            String name = "Mariusz";
            System.out.println("my name: " + name);
        };
    }

}

class MyRunn implements Runnable {
    private String name = "Mattttt";

    @Override
    public void run() {
        System.out.println("my name: " + this.name);
    }

}
