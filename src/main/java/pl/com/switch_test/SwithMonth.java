package pl.com.switch_test;
import pl.com.enum_example.Months;
public class SwithMonth {

    public static void main(String[] args) {

        printNumberOfDays(Months.APRIL);
    }

    public static void printNumberOfDays (Months currentMonth) {
        switch (currentMonth) {
//            public enum months {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                System.out.println("31");
                break;
            case FEBRUARY:
                System.out.println("28");
                break;

            case APRIL:

            case JUNE:

            case SEPTEMBER:

            case NOVEMBER:


            default:
                System.out.println("30");

        }

    }
}
