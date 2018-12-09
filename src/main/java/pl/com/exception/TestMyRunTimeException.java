package pl.com.exception;

public class TestMyRunTimeException {

    public static void main(String[] args) {

        try {
        throw new MyRunTimeException();

    } catch (MyRunTimeException e) {
            e.printStackTrace();
        }
    }


}
