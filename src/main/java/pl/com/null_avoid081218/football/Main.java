package pl.com.null_avoid081218.football;

import java.util.Optional;

// FootballClub -> Stadion (nie jest nulem) -> Chairs (mogą być miejsca stojace) -> Number
public class Main {

    private static void getChairNumber (FootballClub footballClub){
        Optional.ofNullable(footballClub)
                .map(footballClub1 -> footballClub1.getStadium())
                .map(stadion -> stadion.getChair())
                .map(chair -> chair.getNumber())
                .map(number -> number.getNumber())
                .ifPresent(integer -> System.out.println("Number: " + integer));

    }

}
