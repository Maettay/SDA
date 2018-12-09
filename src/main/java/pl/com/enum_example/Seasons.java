package pl.com.enum_example;

public enum Seasons {
    WINTER (-10),
    SPRING (5),
    SUMMER (25),
    AUTOMN (7);

    private float averangeTempInC;
    private Seasons (float averangeTempInC){
        this.averangeTempInC = averangeTempInC;

    }
    public float getAverangeTempInC (){
        return averangeTempInC;

    }

}
