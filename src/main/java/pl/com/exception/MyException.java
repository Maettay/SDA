package pl.com.exception;

public class MyException extends Exception {

    public MyException() {
        //
    }
    public MyException(String message) {
        super(message);
    }
    public MyException(String message, Throwable couse)  {
        super (message, couse);
    }

}
