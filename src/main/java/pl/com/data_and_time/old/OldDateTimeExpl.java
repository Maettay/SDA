package pl.com.data_and_time.old;
import java.util.Calendar;
import java.util.Date;

public class OldDateTimeExpl {

    public static void main(String[] args) {
        Date now = new Date ();
        System.out.println("now: " + now);

        System.out.println(now.getTime());
    //     Date nowAgain = new Date(now.getTime());   //1543152371437
         Date tomorrrow = new Date(1543152371437L + (24 * 60 * 60 * 1000));
        System.out.println(tomorrrow);

        Calendar calendar = Calendar.getInstance();   // get instance zwróci prawidłowy kalendarz, gregoriański, japoński, buddyjski
        calendar.add(Calendar.DAY_OF_MONTH,-1);

        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        calendar.add(Calendar.YEAR,-1);
        System.out.println("date in past: " + calendar);

        System.out.println("calendar: " + calendar);
        System.out.println(calendar.getTime());

    }

}
