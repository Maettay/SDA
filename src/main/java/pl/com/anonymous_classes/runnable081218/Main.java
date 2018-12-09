package pl.com.anonymous_classes.runnable081218;

// 1 - zwykłą klasa implementująca Runnable
abstract class MyRunnable implements Runnable{

    public void run (Runnable runnable) {
        System.out.println("MyRunnable");
    }

}

public class Main  {

    public static void main(String[] args) {

//  2 - klasa anonimowa - z zachowaniem referencji
       Runnable myRun = new Runnable() {
           @Override
           public void run() {
               System.out.println("my anonimous Runnable");
           }
       } ;
    processRunnable(myRun);

// 3 - klasa anonimowa - przekazana jako parametr

        processRunnable(new Runnable() {
            @Override
            public void run() {
                System.out.println("something else");
            }
        });


// 4 - lambda with reference
        Runnable myLambda = () -> System.out.println("Lambda too");
        processRunnable(myLambda);

// 5 - lambda

        processRunnable(() -> System.out.println("lambda"));


    }

    private static void processRunnable (Runnable runnable){
        System.out.println();
        System.out.println("inside processRunnable()");
        runnable.run();     //wołąnie metodki
        System.out.println();
    }

}
