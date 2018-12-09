package pl.com.stream081218;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Country> countries = Arrays.asList(
                new Country("Poland", 40_000_000, 312, 5_000),
                new Country("Canada", 36_000_000, 9_984, 8_000),
                new Country("Spain", 50_000_000, 412, 5_000),
                new Country("Germany", 82_700_000, 357, 9_000),
                new Country("Luxemburg", 602_000, 0.25, 18_000),
                new Country("Spain", 48_000_000, 504, 6_000),
                new Country("Ukraine", 42_800_000, 602, 2_000)
        );

        List<Country> result = genericFilter(countries, country -> country.getAveragePayCheck() > 10_000);
        for (Country country : result) {
            System.out.println(country);
        }
        result.forEach(country -> System.out.println(country));
    }

    private List<Country> getListOfRichCountries(List<Country> countries,
                                                 double minimalPayCheck) {
        List<Country> result = new ArrayList<>();

        for (Country country : countries) {
            if (country.getAveragePayCheck() >= minimalPayCheck) {
                result.add(country);
            }
        }

        return result;
    }

    private List<Country> getCountriesWithMinimalPeopleNumber(
            List<Country> countries, long minimalNumberOfPeople) {

        List<Country> result = new ArrayList<>();

        for (Country country : countries) {
            if (country.getNumberOfPeople() >= minimalNumberOfPeople) {
                result.add(country);
            }
        }

        return result;
    }
    private
    static List<Country> filterByMinimalPeopleNumber(List<Country> countries,
                                                     long minimalPeopleNumber) {

        return countries.stream()
                .filter(country -> country.getNumberOfPeople() > minimalPeopleNumber)
                .collect(Collectors.toList());

    }

    private
    static List<Country> genericFilter(List<Country> countries,
                                       Predicate<Country> predicate) {

        return countries.stream()
                .filter(predicate)
                .collect(Collectors.toList());

    }
}