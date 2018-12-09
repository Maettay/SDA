package pl.com.enum_example;

public enum Months {
    JANUARY (31),
    FEBRUARY (28) {
        @Override   /// można tu pobrać jakaś datę systemową
        public int getNumberOfDays() {
            return super.getNumberOfDays();
        }
    },
    MARCH (31),
    APRIL (30),
    MAY (31),
    JUNE (30),
    JULY (31),
    AUGUST (31),
    SEPTEMBER (30),
    OCTOBER (31),
    NOVEMBER (30),
    DECEMBER (31);

    private int numberOfDays;
    private Months (int numberOfDays){
        this.numberOfDays = numberOfDays;

    }
    public int getNumberOfDays (){
        return numberOfDays;

    }

}
