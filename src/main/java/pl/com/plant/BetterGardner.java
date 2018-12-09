package pl.com.plant;

public class BetterGardner extends Gardener {

    @Override
    public void waterPlant(Plant plant) {
        plant.increaseWaterLEvel(plant.getRequiredIncreaseWaterInMl());  //plant.getRequiredIncreaseWaterInMl ty roślinka, powiedz ile potzebujesz
    }
}
