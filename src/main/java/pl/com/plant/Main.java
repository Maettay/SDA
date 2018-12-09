package pl.com.plant;

public class Main {
    public static void main(String[] args) {

        Plant [] plants = makePlants();
        Gardener roman = new BetterGardner();

        for (int day = 0; day < 7; day++){
        for (Plant plant : plants) {
            roman.waterPlant(plant);
            roman.makePlantGrow(plant);

        }
    }
        for (Plant plant : plants) {
                    System.out.println(plant);
                }

//            (int day = 0; day < 7; day++){
//                for (Plant plant : plants) {
//                    System.out.println(plant);
//                }
//            }

        }

//        for (int day = 0; day < 7; day++){
//            roman.waterPlant(cactus);
//            roman.waterPlant(youngCactus);
//            roman.makePlantGrow(cactus);
//            roman.makePlantGrow(youngCactus);
//
//            roman.waterPlant(rose);
//            roman.waterPlant(youngRose);
//            roman.makePlantGrow(rose);
//            roman.makePlantGrow(youngRose);
//
//            roman.waterPlant(pricklyPear);
//            roman.waterPlant(youngPricklyPear);
//            roman.makePlantGrow(pricklyPear);
//            roman.makePlantGrow(youngPricklyPear);
//
//        }
//
//        System.out.println("Watering Cactus " + cactus);
//        System.out.println("Watering Young Cactus " + youngCactus);
//
//        System.out.println("Watering Rose " + rose);
//        System.out.println("Watering Young Rose " + youngRose);
//
//        System.out.println("Watering Prickly Pear " + pricklyPear);
//        System.out.println("Watering Young Prickly Pear " + youngPricklyPear);
//
//    }
public static Plant[] makePlants () {
    Plant[] results = new Plant[6];

    Plant cactus = new Cactus(10, 20, 30);
    results[0] = cactus;
    results[1] = new Cactus(5, 10, 15);


    results[2] = new Rose(40, 30, 20);
    results[3] = new Rose(20, 15, 10);


    results[4] = new PricklyPear(60, 40, 10);
    results[5] = new PricklyPear(30, 20, 5);

    return results;
    }
}
