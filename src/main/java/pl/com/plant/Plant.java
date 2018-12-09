package pl.com.plant;

public class Plant {

    protected int heightInCm;
    protected int waterUseInMl;
    protected int currentWaterLevelInMl;


    public Plant(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        this.heightInCm = heightInCm;
        this.waterUseInMl = waterUseInMl;
        this.currentWaterLevelInMl = currentWaterLevelInMl;
    }

    public Plant(int heightInCm, int waterUseInMl) {
        this.heightInCm = heightInCm;
        this.waterUseInMl = waterUseInMl;
    }

    public Plant(int currentWaterLevelInMl) {
        this.currentWaterLevelInMl = currentWaterLevelInMl;
    }

    public void grow(){
        //empty
    }

    public int getRequiredIncreaseWaterInMl () {
        return 5;
    }

    public void  increaseWaterLEvel (int waterInMl)

    {
        currentWaterLevelInMl += waterInMl;

    }

    public int setWaterUseInMl() {
        return waterUseInMl;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public int getWaterUseInMl() {
        return waterUseInMl;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }
}
