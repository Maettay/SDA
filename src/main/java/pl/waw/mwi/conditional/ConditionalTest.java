package pl.waw.mwi.conditional;

public class ConditionalTest {

    public static void main(String[] args) {
        printStringLength("ala");
        String value = "ala ma kota";
        printStringLength(value);
        String value2 = null;
        printStringLength(value2);

        testStringLength(null);
        testStringLength("");
    }

    public static void printStringLength(String string) {
        if (string != null) {
            int stringLen = string.length();
            System.out.println("string length: " + stringLen);
        } else {
            System.out.println("null is not allowed here!!!");
        }
    }


    public static void testStringLength(String string) {
        if (null != string && string.length() < 10) {
            System.out.println("Quite short string");
        }
    }

    public static void testAge(int age) {
        if (age < 11) {
            System.out.println("You're too young!!!");
        } else if (age <= 15) {
            System.out.println("closer, but: You're too young!!!");
        } else if (age <= 18) {
            System.out.println("very close, but: You're too young!!!");
        } else {
            System.out.println("You're OK!");
        }


    }
}
