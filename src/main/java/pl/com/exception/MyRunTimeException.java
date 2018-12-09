package pl.com.exception;

public class MyRunTimeException extends RuntimeException {

    public MyRunTimeException () {
        //
    }

    public MyRunTimeException (String message) {
        super (message);
    }

    public MyRunTimeException (String message, Throwable couse) {
        super (message, couse);
    }

}
