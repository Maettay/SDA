package pl.com.exception;

public class ExceptionExample {
    public static void main(String[] args) throws MyException {

        MyExceptionThrower met = new MyExceptionThrower();
//        try {
            met.throwMyException();
            System.out.println("here");
//       } catch (MyException e) {
//            e.printStackTrace();
//        }

       System.out.println("here 2 ");
       System.err.println("here 2 ");

    }


}
