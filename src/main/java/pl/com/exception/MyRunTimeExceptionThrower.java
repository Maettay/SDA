package pl.com.exception;

public class MyRunTimeExceptionThrower {

    public void throwMyRunTimeExceptionThrower (){
        System.out.println("throwMy Exception");
        throw new MyRunTimeException("hahahahha");
    }

}
