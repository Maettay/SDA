package pl.waw.mwi.data_type;

public class DataTypes {

    public static void main(String[] args) {

        byte d = (byte)12843; //2 bajtów     5+8??
        Byte dByte = 0;
        System.out.println("d: " + d);
        System.out.println("Max byte: " + Byte.MAX_VALUE);
        System.out.println("Min byte: " + Byte.MIN_VALUE);


        short c = 0; //2 bajtów     5+8??
        Short cShort = 0;
        System.out.println("Max short: " + Short.MAX_VALUE);
        System.out.println("Min short: " + Short.MIN_VALUE);


        int a = 5 + 8;   // 4 bajty, liczba int
        Integer aInteger = 5 + 8;   // new Integer (5+8)
        System.out.println("Max int: " + Integer.MAX_VALUE);
        System.out.println("Min int: " + Integer.MIN_VALUE);

            long b = 5 + 8; //8 bajtów
            Long bLong = 5L + 8L;
        System.out.println("Max long: " + Long.MAX_VALUE);
        System.out.println("Min long: " + Long.MIN_VALUE);

    float f = 3.11f;   //4bajt
        Float fFloat = 3.11f;
        System.out.println("Max float: " + Float.MAX_VALUE);
        System.out.println("Min float: " + Float.MIN_VALUE);

    double db = 3.11;    //8 bajt
        Double dbDouble = 3.11;
        System.out.println("Max double: " + Double.MAX_VALUE);
        System.out.println("Min double: " + Double.MIN_VALUE);

    boolean trueOrFalse = false;
        trueOrFalse = true;
        Boolean bBoolean = true;
        bBoolean = false;
        bBoolean = null;

     char littelChar = '.';
        Character lCharacter = 'd';
        System.out.println("Max char: " + (int) Character.MAX_VALUE);
        System.out.println("Min char: " + (int) Character.MIN_VALUE);




    }
}
