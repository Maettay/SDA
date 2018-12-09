package pl.com.plant;

public class Cactus extends Plant {

    public Cactus(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }


    @Override
    public void grow() {
      heightInCm += 1;    // += to to samo co  heightInCm = heightInCm + 1;

      currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;


    }
}
