package pl.com.exception;

public class MyRunTimeExceptionTest {

    public static void main(String[] args) {
        // 3 level
        // level 3 - throw MyRunTimeException
        // catch in main()

        try {
            level1();
        } catch (MyRunTimeException exc){
            exc.printStackTrace();
        }

    }
        public static void level1(){
            level2();
        }
        public static void level2()throws MyRunTimeException {
            level3();
        }
        public static void level3() throws MyRunTimeException {
            throw new MyRunTimeException();
        }



}
