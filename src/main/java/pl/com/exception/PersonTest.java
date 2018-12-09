package pl.com.exception;

public class PersonTest {
    public static void main(String[] args) {
        Person me = null;
        try {
            me = new Person("M", "Q", -1);
        } catch (WrongParameter wrongParameter) {
            wrongParameter.printStackTrace();
        }
        System.out.println("pP");
        Person2 pP = new Person2(null,"P",-3);

    }
}
