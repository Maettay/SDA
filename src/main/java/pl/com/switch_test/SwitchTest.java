package pl.com.switch_test;

public class SwitchTest {

    public static void main(String[] args) {
        final int a = 5;
        changeInt(a);
        System.out.println("a after method call: " + a);

        final StringBuilder builder = new StringBuilder();
        builder.append(1);
      //  builder.replace(2);
        builder.reverse();
        // buldier = new StringBuldier ();

    }

    public static void changeInt (int a) {
        a = 6;
        System.out.println("a inside method: " + a);
    }


        // switch vs if
    public static void checkMarkWithSwitch (int mark) {
        switch (mark){
            case 6:
            case 5:
                System.out.println("Great");
      //          break;
            case 4:
            case 3:
                System.out.println("Good");
     //       break;
            default:
                System.out.println("Wrrrrr");
        }
    }
    public static void checkMark (int mark) {
        if (mark == 6 || mark == 5) {
            System.out.println("Great!!!");
        }
            else if(mark <= 4 && mark >=3) {
            }
        else {
            System.out.println("wrrrr");
        }
    }




}
