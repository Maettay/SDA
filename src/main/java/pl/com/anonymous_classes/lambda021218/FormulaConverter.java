package pl.com.anonymous_classes.lambda021218;

@FunctionalInterface
public interface FormulaConverter {

    double fromCelsiusToFahreiheit (double celsius);
    default double fromFahreiheitToCelsius (double fahreiheit){   // ta metoda już nie jest abstarkcyjna
        return 0;
    }


}
