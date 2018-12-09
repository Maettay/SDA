package pl.com.inner_class;

public class HouseTest {

    public static void main(String[] args) {
        House myHouse = new House("Nowa rezdencja dla Javowców");

        House betterHouse1 = new House();
        betterHouse1.setHouseName("Java home");
        House.Apartment myNewApartment = betterHouse1.new Apartment(80);
        House.Apartment mySecondApartment = betterHouse1.new Apartment(78);
        myNewApartment.printNameOfHouse();
        mySecondApartment.printNameOfHouse();

        House betterHouse2 = new House();
        betterHouse2.setHouseName("C# home");
        House.Apartment friendApartment = betterHouse2.new Apartment(68);


    }

}
