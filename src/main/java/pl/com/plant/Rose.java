package pl.com.plant;

public class Rose extends Plant {

    public Rose(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    public Rose(int heightInCm, int waterUseInMl) {
        super(heightInCm, waterUseInMl);
    }

    public Rose(int currentWaterLevelInMl) {
        super(currentWaterLevelInMl);
    }

    @Override
    public void grow() {
        heightInCm += 5;    // += to to samo co  heightInCm = heightInCm + 5;

        currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;
    }
}
