package pl.waw.mwi;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class BrandNewCar {
    private String brand;
    private String model;
    private String colour;
    private int yearOfProduction;

    @Override
    public String toString() {
        return "BrandNewCar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
// constructor
    public BrandNewCar(String brand, String model, String colour, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.yearOfProduction = yearOfProduction;
    }

    public static void main(String[] args) {
        BrandNewCar lexus = new BrandNewCar("Lexus","LC","blue", 2018);
        //audi to jest referencja
        BrandNewCar audi = new BrandNewCar("Audi","A4 Allroad","black",2012);
        BrandNewCar autoMarcina = audi;
        System.out.println("autoMarcina: " + autoMarcina.toString());
        System.out.println("audi: " + audi.toString());



        autoMarcina.setColour("grey");

        System.out.println("Kolor auta Marcina: " + autoMarcina.getColour());

        BrandNewCar autoMarka = null;

        System.out.println("autoMarka: " + autoMarka);





    }
}
