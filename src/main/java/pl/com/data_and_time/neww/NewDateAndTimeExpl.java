package pl.com.data_and_time.neww;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class NewDateAndTimeExpl {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(18,5);
        LocalTime fiveMinutesEarlier = localTime.minusMinutes(5);

        System.out.println("localTime1: " + localTime1);
        System.out.println("////////////////////");

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: " + localDate);

        LocalDate grunwald = LocalDate.of(1410,07,15);
        System.out.println("Bitwa pod Grunwaldem: " + grunwald);
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);

        String formatedTime = localDateTime.format(DateTimeFormatter.ofPattern("YYYY.MM.dd : HH:mm"));
        System.out.println("formatedTime: " + formatedTime);

        Date maybeNow = new Date ();

        long time = maybeNow.getTime();
  //      LocalDateTime maybeNowNewWay = Lo;

        Instant instant = Instant.ofEpochMilli(time);
        LocalDateTime maybeNowNewWay = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        System.out.println("To: " + maybeNowNewWay);


    }

}
