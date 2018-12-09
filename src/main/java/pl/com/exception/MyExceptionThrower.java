package pl.com.exception;

public class MyExceptionThrower {

    public void throwMyException () throws MyException {
        System.out.println("throwMyException()");
        throw    new MyException("hahahahaha");
//tu niżej nic nie może być
    }


}
