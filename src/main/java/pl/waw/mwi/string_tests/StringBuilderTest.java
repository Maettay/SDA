package pl.waw.mwi.string_tests;

public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Mariusz");

        String pat = "pat" + "i" + "mat";

        StringBuilder pat2 = new StringBuilder();
       // pat2.append("pat");
      //  pat2.append("i");
      //  pat2.append("mat");
        //
        pat2.append("pat")
            .append("i")
            .append("mat");

        String pat2String = pat2.toString();
        pat2.replace(3,4,"miał");
        System.out.println(pat2);



    }


}
