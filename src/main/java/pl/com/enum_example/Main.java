package pl.com.enum_example;

public class Main {
    public static void main(String[] args) {
        Seasons maybeSummer = Seasons.SUMMER;

        System.out.println(maybeSummer.name());

        maybeSummer = Seasons.WINTER;
        System.out.println(maybeSummer.name());

    }

}


// for (Week weekDay: Week.values()) {
//  System.out.println ("Day of the week: " + weekDay);
//
// }