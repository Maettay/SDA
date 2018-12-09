package pl.com.enum_example;

public enum Subjects {
    MATHS (12),
    ENGLISH (40),
    GEOGRAPHY (8),
    ECONOMIC (10);

    private int numberOfLessons;
    private Subjects (int numberOfLessons){
        this.numberOfLessons = numberOfLessons;

    }
    public int getNumberOfLessons (){
        return numberOfLessons;

    }
}
