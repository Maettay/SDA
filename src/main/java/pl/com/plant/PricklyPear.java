package pl.com.plant;

public class PricklyPear extends Plant  {

    public PricklyPear(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    public PricklyPear(int heightInCm, int waterUseInMl) {
        super(heightInCm, waterUseInMl);
    }

    public PricklyPear(int currentWaterLevelInMl) {
        super(currentWaterLevelInMl);
    }

    @Override
    public void grow() {
        heightInCm += 3;    // += to to samo co  heightInCm = heightInCm + 3;

        currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;
    }
}
